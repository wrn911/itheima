package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MYJFrame extends JFrame implements ActionListener {
    JButton jtb1 = new JButton();
    JButton jtb2 = new JButton();

    public MYJFrame() {
        this.setSize(603, 680);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);


        jtb1.setBounds(0, 0, 100, 50);
        jtb1.addActionListener(this);


        jtb2.setBounds(100, 0, 100, 50);
        jtb2.addActionListener(this);

        this.getContentPane().add(jtb1);
        this.getContentPane().add(jtb2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行判断

        //获取当前被操作的按钮对象
        Object source = e.getSource();
        Random r = new Random();
        if (source == jtb1){
            jtb1.setSize(300,150);
        }else if (source == jtb2){
            jtb2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
