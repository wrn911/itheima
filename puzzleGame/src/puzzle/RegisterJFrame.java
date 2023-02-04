package puzzle;

import domain.User;
import cn.hutool.core.io.FileUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame  implements MouseListener {
    ArrayList<User> allUser;
    //注册界面
    //添加注册按钮
    JButton register = new JButton();
    //添加重置按钮
    JButton reset = new JButton();
    //添加注册用户名输入框
    JTextField username = new JTextField();
    //密码输入框
    JTextField password = new JTextField();
    //再次密码输入框
    JTextField rePassword = new JTextField();

    public RegisterJFrame(ArrayList<User> allUser){
        this.allUser = allUser;

        //初始化菜单
        initJFrame();

        //初始化界面
        initImage();

        //设为可见,建议写在最后
        this.setVisible(true);
    }

    //初始化菜单
    private void initJFrame() {
        //初始化宽高
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    //初始化图片
    private void initImage() {
        //添加监听
        register.addMouseListener(this);
        reset.addMouseListener(this);

        //1. 添加注册用户名文字
        JLabel registerNameText = new JLabel(new ImageIcon("puzzleGame\\image\\register\\注册用户名.png"));
        registerNameText.setBounds(116, 135, 79, 17);
        this.getContentPane().add(registerNameText);

        //2.添加注册用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加注册密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzleGame\\image\\register\\注册密码.png"));
        passwordText.setBounds(130, 195, 64, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //5.添加再次输入密码文字
        JLabel rePasswordText = new JLabel(new ImageIcon("puzzleGame\\image\\register\\再次输入密码.png"));
        rePasswordText.setBounds(133, 256, 96, 17);
        this.getContentPane().add(rePasswordText);

        //6.再次密码输入框
        rePassword.setBounds(195, 256, 100, 30);
        this.getContentPane().add(rePassword);

        //5.添加注册按钮
        register.setBounds(123, 310, 128, 47);
        register.setIcon(new ImageIcon("puzzleGame\\image\\register\\注册按钮.png"));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //6.添加重置按钮
        reset.setBounds(256, 310, 128, 47);
        reset.setIcon(new ImageIcon("puzzleGame\\image\\register\\重置按钮.png"));
        //去除按钮的默认边框
        reset.setBorderPainted(false);
        //去除按钮的默认背景
        reset.setContentAreaFilled(false);
        this.getContentPane().add(reset);

        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzleGame\\image\\register\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }

    //鼠标单击
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == register){
            //注册
            //用户名,密码不能为空
            if (username.getText().length() == 0 ||password.getText().length() == 0|| rePassword.getText().length() == 0){
                showJDialog("用户名或密码不能为空");
                return;
            }

            //两次密码需要一致
            if (!password.getText().equals(rePassword.getText())){
                showJDialog("两次密码不一致");
                return;
            }

            //用户名和密码格式是否正确
            /*if (!username.getText().matches("[a-zA-Z0-9_]{4,16}")){
                showJDialog("用户名格式不正确,用户名长度为4~16,且必须由字母或数字或下划线组成");
                return;
            }
            if (!password.getText().matches("\\S*(?=\\S{6,})(?=\\S*\\d)(?=\\S*[a-zA-Z])\\S*")){
                showJDialog("密码格式不正确,密码长度需大于6,且必须由字母或数字组成");
                return;
            }*/

            //判断用户名是否重复
            if (containsUsername(username.getText())){
                showJDialog("用户名重复");
                return;
            }

            //添加用户
            allUser.add(new User(username.getText(),password.getText()));
            showJDialog("注册成功");

            //写入数据
            FileUtil.writeUtf8Lines(allUser,"D:\\Java\\IdeaProjects\\itheima\\puzzleGame\\src\\name.txt");

            //跳转登录页面
            this.setVisible(false);
            new LoginJFrame();

        } else if (e.getSource() == reset) {
            //重置
            username.setText("");
            password.setText("");
            rePassword.setText("");
        }
    }

    //判断用户名是否重复
    public boolean containsUsername(String username){
        for (User user : allUser) {
            if (username.equals(user.getUserName())){
                return true;
            }
        }
        return false;
    }

    //输出带有提示文字的弹框
    public void showJDialog(String content) {
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

    @Override
    public void mousePressed(MouseEvent e) {
        //显示按下的样子
        //判断按键
        Object source = e.getSource();
        if (source == register) {
            register.setIcon(new ImageIcon("puzzleGame\\image\\register\\注册按下.png"));
        } else if (source == reset) {
            reset.setIcon(new ImageIcon("puzzleGame\\image\\register\\重置按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //显示松开的样子
        //判断按键
        Object source = e.getSource();
        if (source == register) {
            register.setIcon(new ImageIcon("puzzleGame\\image\\register\\注册按钮.png"));
        } else if (source == reset) {
            reset.setIcon(new ImageIcon("puzzleGame\\image\\register\\重置按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
