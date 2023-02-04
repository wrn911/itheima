package com.itheima.ui;

import com.itheima.thread.ToZipThread;
import com.itheima.thread.UnZipThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class NoteJFrame extends JFrame implements ActionListener {
    //初始化表格的内容
    //二维数组中的每一个一维数组，是表格里面的一行数据
    Object[][] tabledatas;

    //创建三个按钮
    JButton add = new JButton("添加");
    JButton update = new JButton("修改");
    JButton delete = new JButton("删除");

    //创建表格组件
    JTable table;

    //创建菜单的导入和导出
    JMenuItem exportItem = new JMenuItem("导出");
    JMenuItem importItem = new JMenuItem("导入");

    public NoteJFrame() {
        tabledatas = initTable();
        //初始化界面
        initFrame();
        //初始化菜单
        initJmenuBar();
        //初始化组件
        initView();
        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前那个组件被点击
        Object obj = e.getSource();
        if (obj == add) {
            System.out.println("添加按钮被点击");
            this.setVisible(false);
            new AddJFrame();

        } else if (obj == update) {
            System.out.println("修改按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，跳转添加界面

            //获取用户选择了表格中的哪一行
            //i = 0: 表示用户选择了第一行
            //i = 1: 表示用户选择了第一行
            //i有两个作用：
            //i小于0，表示用户没有选择，此时无法修改
            //i大于等于0：通过这个行数就可以获取二维数组中对应的数据
            int i = table.getSelectedRow();
            if (i < 0) {
                showJDialog("未选择数据,此时无法修改");
                return;
            }
            System.out.println(i);
            this.setVisible(false);
            new UpdateJFrame(i, tabledatas);

        } else if (obj == delete) {
            System.out.println("删除按钮被点击");
            //逻辑：
            //1.先判断用户有没有选择表格中的数据
            //2.如果没有选择，弹框提示：未选择。此时提示的弹框用showJDialog方法即可
            //3.如果选择了，弹框提示：是否确定删除。此时提示的弹框用showChooseJDialog方法
            int index = table.getSelectedRow();
            if (index < 0) {
                showJDialog("未选择");
                return;
            }
            System.out.println(index);


            //作用：展示一个带有确定和取消按钮的弹框
            //方法的返回值：0 表示用户点击了确定
            //             1 表示用户点击了取消
            //该弹框用于用户删除时候，询问用户是否确定删除
            int i = showChooseJDialog();
            System.out.println(i);
            if (i == 0) {
                //确认删除
                //更新count中的编号
                //获取对应编号
                String line = null;
                try {
                    BufferedReader br = new BufferedReader(new FileReader("diary\\diary\\data\\count.txt"));
                    line = br.readLine();
                    br.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                int count = Integer.parseInt(line);
                count--;
                //更新编号
                PrintWriter pw = null;
                try {
                    pw = new PrintWriter(new FileWriter("diary\\diary\\data\\count.txt"));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                pw.println(count);
                pw.close();

                //更新二维数组
                Object[][] temp = new Object[tabledatas.length - 1][];
                System.arraycopy(tabledatas, 0, temp, 0, index);
                //遍历数组,拷贝后面的元素
                for (int i1 = index; i1 < temp.length; i1++) {
                    //修改编号
                    //获取编号
                    String str = (String) tabledatas[i1 + 1][0];
                    String s = str.substring(2);
                    int count1 = Integer.parseInt(s);
                    //要删除元素后的元素索引减一
                    count1--;
                    //修改字符串数据中的编号
                    tabledatas[i1 + 1][0] = str.substring(0, 2) + count1;
                    //拷贝
                    temp[i1] = tabledatas[i1 + 1];
                }
                tabledatas = temp;

                //持久化存储
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("diary\\diary\\data\\data.txt"));
                    for (Object[] tabledata : tabledatas) {
                        //用于拼接数据
                        StringJoiner sj = new StringJoiner("-");
                        for (Object o : tabledata) {
                            String s = (String) o;
                            sj.add(s);
                        }
                        bw.write(sj.toString());
                        bw.newLine();
                    }
                    bw.close();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                showJDialog("删除成功");

                //界面刷新
                new NoteJFrame();
                this.setVisible(false);
            }


        } else if (obj == exportItem) {
            System.out.println("菜单的导出功能");
            //压缩目的地
            File dest = new File("C:\\Users\\86139\\Desktop\\data.zip");
            //压缩文件
            //1.创建一个线程
            ToZipThread tzt = new ToZipThread(dest);
            //2.执行
            tzt.start();

            /*try {
                //创建压缩流关联压缩包
                ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
                //压缩文件
                toZip(zos);
                //释放资源
                zos.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }*/

            showJDialog("导出成功!");

        } else if (obj == importItem) {
            System.out.println("菜单的导入功能");
            //压缩包
            File src = new File("C:\\Users\\86139\\Desktop\\data.zip");
            //解压后的地址
            File dest = new File("diary\\diary\\data\\data.txt");
            //定义一个方法用于解压
            //1.创建一个线程
            UnZipThread uzt = new UnZipThread(src,dest);
            //2.执行
            uzt.start();
            /*try {
                unZip(src, dest);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }*/
            showJDialog("导入成功!");
            //界面刷新
            new NoteJFrame();
            this.setVisible(false);

        }
    }

    /*//定义一个方法用于解压
    private void unZip(File src, File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry ze;
        //获取对应编号
        BufferedReader br = new BufferedReader(new FileReader("diary\\diary\\data\\count.txt"));
        String line = br.readLine();
        br.close();
        int count = Integer.parseInt(line);
        while ((ze = zis.getNextEntry()) != null) {
            //新元素的编号
            count++;
            //读取数据,并解码成字符串
            byte[] bytes = zis.readAllBytes();
            String str = new String(bytes);
            //获取文件名标题
            String title = ze.toString().split("\\.")[0];
            //写入数据
            BufferedWriter bw = new BufferedWriter(new FileWriter("diary\\diary\\data\\data.txt", true));
            bw.write("编号" + count + "-" + title + "-" + str);
            bw.newLine();
            bw.close();
            zis.closeEntry();
        }
        zis.close();
        //更新文件中的编号
        PrintWriter pw = new PrintWriter(new FileWriter("diary\\diary\\data\\count.txt"));
        pw.println(count);
        pw.close();
    }

    //定义一个方法用于压缩
    private void toZip(ZipOutputStream zos) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("diary\\diary\\data\\data.txt"));
        String line;
        //读取日记信息
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            //拼接文件名
            String fileName = arr[1] + ".txt";
            //拷贝
            //创建zipentry对象
            ZipEntry ze = new ZipEntry(fileName);
            //把zipEntry放到压缩包中
            zos.putNextEntry(ze);
            //写入数据
            String str = arr[2];
            //底层细节:若用字节数组写出,则写出文件的编码为默认编码utf-8
            byte[] bytes = str.getBytes();
            zos.write(bytes);
            //关流,表示当前文件拷贝完毕
            zos.closeEntry();
        }
    }*/

    //初始化组件
    private void initView() {
        //定义最上面的每日一记
        JLabel title = new JLabel("每日一记");
        title.setBounds(220, 20, 584, 50);
        title.setFont(new Font("宋体", Font.BOLD, 32));
        this.getContentPane().add(title);

        //定义表格的标题
        Object[] tableTitles = {"编号", "标题", "正文"};

        //定义表格组件
        //并给表格设置标题和内容
        table = new JTable(tabledatas, tableTitles);
        table.setBounds(40, 70, 504, 380);

        //创建可滚动的组件，并把表格组件放在滚动组件中间
        //好处：如果表格中数据过多，可以进行上下滚动
        JScrollPane jScrollPane = new JScrollPane(table);
        jScrollPane.setBounds(40, 70, 504, 380);
        this.getContentPane().add(jScrollPane);

        //给三个按钮设置宽高属性，并添加点击事件
        add.setBounds(40, 466, 140, 40);
        update.setBounds(222, 466, 140, 40);
        delete.setBounds(404, 466, 140, 40);

        add.setFont(new Font("宋体", Font.PLAIN, 24));
        update.setFont(new Font("宋体", Font.PLAIN, 24));
        delete.setFont(new Font("宋体", Font.PLAIN, 24));

        add.addActionListener(this);
        update.addActionListener(this);
        delete.addActionListener(this);


        this.getContentPane().add(add);
        this.getContentPane().add(update);
        this.getContentPane().add(delete);
    }

    //初始化表格的内容
    private Object[][] initTable() {
        ArrayList<Object[]> list = new ArrayList<>();
        String line;
        //记录集合中前一个元素的索引
        int index = -1;
        try {
            BufferedReader br = new BufferedReader(new FileReader("diary\\diary\\data\\data.txt"));
            while ((line = br.readLine()) != null) {
                String[] arr = line.split("-");
                if (arr.length == 1){
                    list.get(index)[2] += arr[0];
                }else {
                    list.add(arr);
                    index++;
                }
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Object[][] tabledatas = new Object[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            tabledatas[i] = list.get(i);
        }
        return tabledatas;
    }

    //初始化菜单
    private void initJmenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单上面的两个选项的对象 （功能  关于我们）
        JMenu functionJMenu = new JMenu("功能");

        //把5个存档，添加到saveJMenu中
        functionJMenu.add(exportItem);
        functionJMenu.add(importItem);

        //将菜单里面的两个选项添加到菜单当中
        jMenuBar.add(functionJMenu);

        //绑定点击事件
        exportItem.addActionListener(this);
        importItem.addActionListener(this);

        //给菜单设置颜色
        jMenuBar.setBackground(new Color(230, 230, 230));

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    //初始化界面
    private void initFrame() {
        //设置界面的宽高
        this.setSize(600, 600);
        //设置界面的标题
        this.setTitle("每日一记");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
        this.setLayout(null);
        //设置背景颜色
        this.getContentPane().setBackground(new Color(212, 212, 212));
    }

    //只创建一个弹框对象
    JDialog jDialog = new JDialog();

    //因为展示弹框的代码，会被运行多次
    //所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
    //直接调用就可以了。
    //展示弹框
    public void showJDialog(String content) {
        if (!jDialog.isVisible()) {
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //给弹框设置大小
            jDialog.setSize(200, 150);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭永远无法操作下面的界面
            jDialog.setModal(true);

            //创建Jlabel对象管理文字并添加到弹框当中
            JLabel warning = new JLabel(content);
            warning.setBounds(0, 0, 200, 150);
            jDialog.getContentPane().add(warning);

            //让弹框展示出来
            jDialog.setVisible(true);
        }
    }

    /*
     *  作用：展示一个带有确定和取消按钮的弹框
     *
     *  方法的返回值：
     *       0 表示用户点击了确定
     *       1 表示用户点击了取消
     *       该弹框用于用户删除时候，询问用户是否确定删除
     * */
    public int showChooseJDialog() {
        return JOptionPane.showConfirmDialog(this, "是否删除选中数据？", "删除信息确认", JOptionPane.YES_NO_OPTION);
    }
}
