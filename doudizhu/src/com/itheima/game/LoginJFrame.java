package com.itheima.game;

import com.itheima.domain.User;
import com.itheima.util.CodeUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {

    //初始化用户信息
    static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("zhangsan", "1234"));
    }


    //登录按钮
    JButton login = new JButton();
    //注册按钮
    JButton register = new JButton();
    //用户名文本框
    JTextField username = new JTextField();
    //密码文本框
    JPasswordField password = new JPasswordField();
    //验证码文本框
    JTextField code = new JTextField();

    //正确的验证码
    JLabel rightCode = new JLabel();

    public LoginJFrame() {
        //初始化界面
        initJFrame();
        //初始化组件，在这个界面中添加内容
        initView();
        //让当前界面显示出来
        this.setVisible(true);
    }

    //在这个界面中添加内容
    public void initView() {
        //1. 添加用户名文字
        //name表示字体样式
        //style表示加粗(1)或斜体(2)
        //size表示大小
        //Font类用于设置图形用户界面上的字体样式的
        Font usernameFont = new Font(null, 1, 16);
        //管理的文本内容
        JLabel usernameText = new JLabel("用户名");
        //设置颜色为白色
        usernameText.setForeground(Color.white);
        //把字体的设置信息设置给JLabel(设置字体)
        usernameText.setFont(usernameFont);
        //位置和大小
        usernameText.setBounds(140, 55, 55, 22);
        //用户名添加到界面之中
        this.getContentPane().add(usernameText);

        //2.添加用户名输入框
        username.setBounds(223, 46, 200, 30);
        this.getContentPane().add(username);

        //3.添加密码文字
        //设置内容
        JLabel passwordText = new JLabel("密码");
        Font passwordFont = new Font(null, 1, 16);
        //设置颜色
        passwordText.setForeground(Color.white);
        //设置字体
        passwordText.setFont(passwordFont);
        //位置和宽高
        passwordText.setBounds(197, 95, 40, 22);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        password.setBounds(263, 87, 160, 30);
        this.getContentPane().add(password);

        //验证码提示
        //设置内容
        JLabel codeText = new JLabel("验证码");
        Font codeFont = new Font(null, 1, 16);
        //设置颜色
        codeText.setForeground(Color.white);
        //设置字体
        codeText.setFont(codeFont);
        //位置和宽高
        codeText.setBounds(215, 142, 55, 22);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(291, 133, 100, 30);
        this.getContentPane().add(code);

        //获取正确的验证码
        String codeStr = CodeUtil.getCode();
        Font rightCodeFont = new Font(null, 1, 15);
        //设置颜色
        rightCode.setForeground(Color.RED);
        //设置字体
        rightCode.setFont(rightCodeFont);
        //设置内容
        rightCode.setText(codeStr);
        //绑定鼠标事件
        rightCode.addMouseListener(this);
        //位置和宽高
        rightCode.setBounds(400, 133, 100, 30);
        //添加到界面
        this.getContentPane().add(rightCode);

        //5.添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon("doudizhu\\image\\login\\登录按钮.png"));
        //去除按钮的边框
        login.setBorderPainted(false);
        //去除按钮的背景
        login.setContentAreaFilled(false);
        //给登录按钮绑定鼠标事件
        login.addMouseListener(this);
        this.getContentPane().add(login);

        //6.添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon("doudizhu\\image\\login\\注册按钮.png"));
        //去除按钮的边框
        register.setBorderPainted(false);
        //去除按钮的背景
        register.setContentAreaFilled(false);
        //给注册按钮绑定鼠标事件
        register.addMouseListener(this);
        this.getContentPane().add(register);


        //7.添加背景图片
        JLabel background = new JLabel(new ImageIcon("doudizhu\\image\\login\\background.png"));
        background.setBounds(0, 0, 633, 423);
        this.getContentPane().add(background);

    }

    //初始化组件，在这个界面中添加内容
    public void initJFrame() {
        this.setSize(633, 423);//设置宽高
        this.setTitle("斗地主游戏 V1.0登录");//设置标题
        this.setDefaultCloseOperation(3);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }

    //点击
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == login) {
            //完成点击了登录按钮之后的所有逻辑
            //获取用户输入的验证码和用户名密码
            String codeText = code.getText();
            String passwordText = password.getText();
            String usernameText = username.getText();
            //逻辑一：
            // 	如果验证码为空，弹框提示：验证码为空
            if (codeText.length() == 0) {
                showJDialog("验证码为空");
                return;
            }
            //逻辑二：
            // 	如果用户名或者密码为空，弹框提示：用户名或密码为空
            if (passwordText.length() == 0 || usernameText.length() == 0) {
                showJDialog("用户名或密码为空");
                return;
            }
            //逻辑三：
            // 	判断用户名和密码是否正确
            // 	正确：关闭当前界面，打开游戏界面
            // 	错误：弹框提示：用户名或密码错误
            if (!codeText.equalsIgnoreCase(rightCode.getText())) {
                showJDialog("验证码错误");
                return;
            }

            if (!users.contains(new User(usernameText, passwordText))) {
                showJDialog("用户名或密码错误");
                return;
            }

            this.setVisible(false);
            new GameJFrame();

        } else if (e.getSource() == register) {
            showJDialog("进入注册界面");
        } else if (e.getSource() == rightCode) {
            //获取正确的验证码
            String codeStr = CodeUtil.getCode();
            //设置内容
            rightCode.setText(codeStr);
        }
    }

    //展示弹框
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

    //按下不松
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("doudizhu\\image\\login\\登录按下.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("doudizhu\\image\\login\\注册按下.png"));
        }
    }

    //松开按钮
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == login) {
            login.setIcon(new ImageIcon("doudizhu\\image\\login\\登录按钮.png"));
        } else if (e.getSource() == register) {
            register.setIcon(new ImageIcon("doudizhu\\image\\login\\注册按钮.png"));
        }
    }

    //鼠标划入
    @Override
    public void mouseEntered(MouseEvent e) {

    }

    //鼠标划出
    @Override
    public void mouseExited(MouseEvent e) {

    }


}