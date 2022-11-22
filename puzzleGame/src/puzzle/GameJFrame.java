package puzzle;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    //创建二维数组
    //目的:用来管理数据
    //加载图片时,会根据二维数组中的数据进行加载
    //写在方法外,因为多个方法要用到这个数组
    int[][] data = new int[4][4];

    //创建一个变量储存文件路径
    String path = "puzzleGame\\image\\animal\\animal3\\";

    //定义一个新的二维数组表示正确顺序
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //这个类代表游戏界面
    //构造方法,初始化值
    public GameJFrame() {
        //初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据(打乱)
        initData();

        //初始化图片
        initImage();

        //设为可见,建议写在最后
        this.setVisible(true);
    }

    //记录0图片的位置
    int x = 0;
    int y = 0;

    //定义统计变量统计步数
    int step = 0;

    //创建选项下面的条目对象
    //因为后面多个方法中需要用到,所以要放到成员位置
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    JMenuItem payItem = new JMenuItem("充值入口");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    //判断胜利
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            //i:依次表示二维数组data里面的索引
            //data[i]:依次表示每一个一维数组
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]){
                    //只要有一个数据不一样,则返回false
                    return false;
                }
            }
        }
        //循环结束表示数组遍历完毕,全部数据都一样
        return true;
    }

    //初始化数据(打乱)
    private void initData() {
        //打乱一维数组数据,并将其添加到二维数组中
        //定义一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数据
        //打乱,获取数组中的每一个元素,并将其与一个随机索引交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int Index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[Index];
            tempArr[Index] = temp;
        }
        //添加数据
        //解法一:遍历一维数组
        for (int i = 0; i < tempArr.length; i++) {
            //判断是否为0图片
            //记录0图片的位置
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    //初始化图片
    private void initImage() {
        //清空原有所有图片
        this.getContentPane().removeAll();

        if (victory()){
            //加载胜利图片
            JLabel jLabel = new JLabel(new ImageIcon("puzzleGame\\image\\win.png"));
            jLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(jLabel);
        }

        //显示文字
        JLabel stepJLabel = new JLabel("步数:" + step);
        stepJLabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepJLabel);

        //外循环 --- 重复执行4次内循环
        for (int i = 0; i < 4; i++) {
            //内循环 -- 表示在一行添加4张图片
            for (int j = 0; j < 4; j++) {
                int number = data[i][j];
                //创建一个图片ImageIcon的对象,创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path + number + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 82, 105 * i + 134, 105, 105);
                //给图片添加边框
                //0:让图片凸出来
                //1:...凹下去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);
                //注意,当number == 0 时,虽然找不到图片,但还是会生成一个空白的JLabel对象
            }
        }

        //加载背景图片
        //细节:先加载的图片在上方,后加载的图片塞在下面
        JLabel jLabel = new JLabel(new ImageIcon("puzzleGame\\image\\background.png"));
        jLabel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(jLabel);

        //刷新
        this.getContentPane().repaint();
    }

    private void initJFrame() {
        //初始化宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图游戏 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置,只有取消才会按照XY轴的方式添加组件
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }

    private void initJMenuBar() {
        //创建整个的菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面两个选项的对象(功能  关于我们)
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        JMenu payJMenu = new JMenu("充值入口");
        JMenu changeImage = new JMenu("更换图片");


        //给条目对象绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        payItem.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);

        //将每一个选项下的条目添加到选项中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        payJMenu.add(payItem);

        //将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        jMenuBar.add(payJMenu);

        //将菜单添加到界面中
        this.setJMenuBar(jMenuBar);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当按住不松时调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //清空之前的图片
            //加载完整图片
            this.getContentPane().removeAll();
            JLabel jLabel1 = new JLabel(new ImageIcon(path + "all.jpg"));
            jLabel1.setBounds(83, 134, 420, 420);
            this.getContentPane().add(jLabel1);
            //加载背景图片
            //细节:先加载的图片在上方,后加载的图片塞在下面
            JLabel jLabel2 = new JLabel(new ImageIcon("puzzleGame\\image\\background.png"));
            jLabel2.setBounds(40, 40, 508, 560);
            this.getContentPane().add(jLabel2);
            //刷新
            this.getContentPane().repaint();
        }
    }

    //当松开按键时调用这个方法
    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()){
            //结束方法
            return;
        }
        int code = e.getKeyCode();
        //对按键进行判断
        //左:37 上:38 右:39 下:40
        if (code == 37) {
            if (y == 3) {
                //表示空白方块已经在最右边,右方已经没有方块可以移动
                return;
            }
            System.out.println("向左移动");
            //逻辑:
            //把空白方块右方的方块向左移动
            //x , y 表示空白方块
            //x, y + 1表示空白方块右方的方块
            //把空白方块上方的数字赋值给空白方块
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            //重新记录空白方块的位置
            y++;
            //每次移动一次,计数器就自增一次
            step++;
            //重新加载图片
            initImage();
        } else if (code == 38) {
            if (x == 3) {
                //表示空白方块已经在最下边,下方已经没有方块可以移动
                return;
            }
            System.out.println("向上移动");
            //逻辑:
            //把空白方块下方的方块向上移动
            //x , y 表示空白方块
            //x + 1, y表示空白方块下方的方块
            //把空白方块下方的数字赋值给空白方块
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            //重新记录空白方块的位置
            x++;
            //每次移动一次,计数器就自增一次
            step++;
            //重新加载图片
            initImage();
        } else if (code == 39) {
            if (y == 0) {
                //表示空白方块已经在最左边,左方已经没有方块可以移动
                return;
            }
            System.out.println("向右移动");
            //逻辑:
            //把空白方块左方的方块向右移动
            //x , y 表示空白方块
            //x, y - 1表示空白方块左方的方块
            //把空白方块上方的数字赋值给空白方块
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            //重新记录空白方块的位置
            y--;
            //每次移动一次,计数器就自增一次
            step++;
            //重新加载图片
            initImage();
        } else if (code == 40) {
            if (x == 0) {
                //表示空白方块已经在最上边,上方已经没有方块可以移动
                return;
            }
            System.out.println("向下移动");
            //逻辑:
            //把空白方块上方的方块向下移动
            //x , y 表示空白方块
            //x - 1, y表示空白方块上方的方块
            //把空白方块上方的数字赋值给空白方块
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            //重新记录空白方块的位置
            x--;
            //每次移动一次,计数器就自增一次
            step++;
            //重新加载图片
            initImage();
        } else if (code == 65) {
            //重新加载图片
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}
            };
            initImage();
            //重新确定空白格的位置
            x = y = 3;
        }
    }

    //鼠标单击时调用这个方法
    @Override
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        //获取当前被点击的条目对象
        Object obj = e.getSource();
        //判断
        if (obj == replayItem){
            System.out.println("重新游戏");
            //计数器归零
            step = 0;
            //重新打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();
        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            //关闭当前窗体
            this.setVisible(false);
            //显示登录界面
            new LoginJFrame();
        }else if (obj == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        } else if (obj == accountItem) {
            System.out.println("公众号");
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象JLabel
            JLabel jLabel = new JLabel(new ImageIcon("puzzleGame\\image\\about.png"));
            //设置位置和宽高
            jLabel.setBounds(0,0,258,258);
            //把图片添加到弹框中
            jDialog.getContentPane().add(jLabel);
            // 给弹框对象设置大小
            jDialog.setSize(344,344);
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);

        } else if (obj == payItem) {
            System.out.println("充值入口");
        } else if (obj == girl) {
            System.out.println("美女");
            //修改path的路径
            //随机选择图片
            path = "puzzleGame\\image\\girl\\girl"+(1 + r.nextInt(11))+"\\";
            //重新开始
            //计数器归零
            step = 0;
            //重新打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();
        }else if (obj == animal) {
            System.out.println("动物");
            //修改path的路径
            //随机选择图片
            path = "puzzleGame\\image\\animal\\animal"+(1 + r.nextInt(8))+"\\";
            //重新开始
            //计数器归零
            step = 0;
            //重新打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();
        }else if (obj == sport) {
            System.out.println("运动");
            //修改path的路径
            //随机选择图片
            path = "puzzleGame\\image\\sport\\sport"+(1 + r.nextInt(10))+"\\";
            //重新开始
            //计数器归零
            step = 0;
            //重新打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();
        }
    }
}
