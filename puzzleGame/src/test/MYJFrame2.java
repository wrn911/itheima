package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MYJFrame2 extends JFrame implements KeyListener {


    public MYJFrame2() {
        this.setSize(603, 680);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);


        //给整个窗体添加键盘监听
        //调用者this:本类对象
        //addKeyListener添加键盘监听
        //参数this:当事件被触发后,会执行本类代码
        this.addKeyListener(this);


        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
        //获取键盘上每一个按键的编号
        int code = e.getKeyCode();
        if (code == 65){
            System.out.println("A");
        } else if (code == 66) {
            System.out.println("B");

        }
    }
}
