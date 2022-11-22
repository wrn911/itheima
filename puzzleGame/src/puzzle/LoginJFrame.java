package puzzle;

import User.User;
import Util.CodeUtil;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    //登录界面

    //定义一个列表,储存用户信息
    static ArrayList<User> list = new ArrayList<>();

    //在这里写一个静态代码块,初始化用户信息
    static {
        list.add(new User("zhangsan", "123456"));
        list.add(new User("lisi", "123456"));
    }

    //添加登录按钮
    JButton login = new JButton();
    //添加注册按钮
    JButton register = new JButton();
    //添加用户名输入框
    JTextField username = new JTextField();
    //添加密码输入框
    JPasswordField password = new JPasswordField();
    //验证码的输入框
    JTextField code = new JTextField();
    //获取验证码
    JLabel rightCode = new JLabel();
    //获取验证码
    String codeStr = CodeUtil.getCode();


    //路径
    String loginPath = "puzzleGame\\image\\login\\登录按钮.png";
    String registerPath = "puzzleGame\\image\\register\\注册按钮.png";

    public LoginJFrame() {
        //初始化菜单
        initJFrame();

        //初始化图片
        initImage();

        //设为可见,建议写在最后
        this.setVisible(true);


        //添加监听
        login.addMouseListener(this);
        register.addMouseListener(this);

        rightCode.addMouseListener(this);
    }

    //初始化图片
    private void initImage() {
        //清空原有所有图片
        this.getContentPane().removeAll();

        //添加用户名文字
        JLabel usernameText = new JLabel(new ImageIcon("puzzleGame\\image\\login\\用户名.png"));
        usernameText.setBounds(116, 135, 47, 17);
        this.getContentPane().add(usernameText);

        //添加用户名输入框
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //添加密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzleGame\\image\\login\\密码.png"));
        passwordText.setBounds(130, 195, 32, 16);
        this.getContentPane().add(passwordText);

        //添加密码输入框
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //验证码提示
        JLabel codeText = new JLabel(new ImageIcon("puzzleGame\\image\\login\\验证码.png"));
        codeText.setBounds(133, 256, 50, 30);
        this.getContentPane().add(codeText);

        //验证码的输入框
        code.setBounds(195, 256, 100, 30);
        this.getContentPane().add(code);
        System.out.println(code.getText());

        //获取验证码
        //设置内容
        rightCode.setText(codeStr);
        //位置和宽高
        rightCode.setBounds(300, 256, 50, 30);
        //添加到界面
        this.getContentPane().add(rightCode);

        //添加登录按钮
        login.setBounds(123, 310, 128, 47);
        login.setIcon(new ImageIcon(loginPath));
        //去除按钮的默认边框
        login.setBorderPainted(false);
        //去除按钮的默认背景
        login.setContentAreaFilled(false);
        this.getContentPane().add(login);

        //添加注册按钮
        register.setBounds(256, 310, 128, 47);
        register.setIcon(new ImageIcon(registerPath));
        //去除按钮的默认边框
        register.setBorderPainted(false);
        //去除按钮的默认背景
        register.setContentAreaFilled(false);
        this.getContentPane().add(register);

        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzleGame\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);

        //刷新
        this.getContentPane().repaint();
    }

    //初始化菜单
    private void initJFrame() {
        //初始化宽高
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置,只有取消才会按照XY轴的方式添加组件
        this.setLayout(null);

    }

    //鼠标单击
    @Override
    public void mouseClicked(MouseEvent e) {
        Object source = e.getSource();
        if (source == login) {
            String inUsername;
            String inPassword;
            String inCode;

            //获取用户名,密码,验证码
            inUsername = username.getText();
            inPassword = password.getText();
            inCode = code.getText();

            //判断是否为空白
            boolean b = ifBlank(inUsername, inPassword, inCode);
            if (b) {
                //判断验证码是否存在
                if (!inCode.equalsIgnoreCase(codeStr)) {
                    //不存在直接结束方法
                    showJDialog("验证码不正确,请重新输入");
                    return;
                }

                //创建对象
                User user = new User(inUsername, inPassword);
                //判断对象在列表中存在与否
                boolean flag = containsInList(list, user);
                if (flag) {
                    new GameJFrame();
                    //关掉当前窗口
                    this.setVisible(false);
                } else {
                    showJDialog("用户名或密码不正确,请重新输入");
                }
            }else {
                if (inUsername.equals("")) {
                    showJDialog("请输入用户名");
                } else if (inPassword.equals("")) {
                    showJDialog("请输入密码");
                } else if (inCode.equals("")) {
                    showJDialog("请输入验证码");
                }
            }
        } else if (source == register) {
            //登录
            new RegisterJFrame();
            //关掉当前窗口
            this.setVisible(false);
        } else if (source == rightCode) {
            //重置验证码
            String codeStr = CodeUtil.getCode();
            //设置内容
            rightCode.setText(codeStr);
            System.out.println(codeStr);
        }


    }

    //判断对象在列表中存在与否
    public boolean containsInList(ArrayList<User> list, User user) {
        for (int i = 0; i < list.size(); i++) {
            String username = list.get(i).getUserName();
            String password = list.get(i).getPassword();
            if (username.equals(user.getUserName()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

    //按下不松
    @Override
    public void mousePressed(MouseEvent e) {
        //显示按下的样子
        //判断按键
        Object source = e.getSource();
        if (source == login) {
            loginPath = "puzzleGame\\image\\login\\登录按下.png";
            login.setIcon(new ImageIcon(loginPath));
        } else if (source == register) {
            registerPath = "puzzleGame\\image\\login\\注册按下.png";
            register.setIcon(new ImageIcon(registerPath));
        }
    }

    //松开鼠标
    @Override
    public void mouseReleased(MouseEvent e) {
        //恢复原来的样子
        //判断按键
        Object source = e.getSource();
        if (source == login) {
            loginPath = "puzzleGame\\image\\login\\登录按钮.png";
            login.setIcon(new ImageIcon(loginPath));
        } else if (source == register) {
            registerPath = "puzzleGame\\image\\login\\注册按钮.png";
            register.setIcon(new ImageIcon(registerPath));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

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

    //判断是否为空白
    public boolean ifBlank(String inUsername, String inPassword, String inCode) {
        if (inUsername.equals("")) {
            //不存在直接结束方法
            return false;
        } else if (inPassword.equals("")) {
            //不存在直接结束方法
            return false;
        } else if (inCode.equals("")) {
            return false;
        }
        return true;
    }
}
