package puzzle;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RegisterJFrame extends JFrame  implements MouseListener {
    //注册界面
    //添加注册按钮
    JButton register = new JButton();
    //6.添加重置按钮
    JButton reset = new JButton();
    public RegisterJFrame(){

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
        JTextField username = new JTextField();
        username.setBounds(195, 134, 200, 30);
        this.getContentPane().add(username);

        //3.添加注册密码文字
        JLabel passwordText = new JLabel(new ImageIcon("puzzleGame\\image\\register\\注册密码.png"));
        passwordText.setBounds(130, 195, 64, 16);
        this.getContentPane().add(passwordText);

        //4.密码输入框
        JTextField password = new JTextField();
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);

        //5.添加再次输入密码文字
        JLabel rePasswordText = new JLabel(new ImageIcon("puzzleGame\\image\\register\\再次输入密码.png"));
        rePasswordText.setBounds(133, 256, 96, 17);
        this.getContentPane().add(rePasswordText);

        //6.再次密码输入框
        JTextField rePassword = new JTextField();
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

    @Override
    public void mouseClicked(MouseEvent e) {

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
            this.setVisible(false);
            new LoginJFrame();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
