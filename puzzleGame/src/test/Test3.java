package test;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置界面宽高
        jFrame.setSize(603,680);
        //设置标题
        jFrame.setTitle("演示");
        //设置置顶
        jFrame.setAlwaysOnTop(true);
        //设置居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置
        jFrame.setLayout(null);

        //创建一个按钮对象
        JButton jtb = new JButton("点我");
        //设置位置和宽高
        jtb.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //addActionListener:表示我要给组件添加哪个事件监听(动作监听:包含鼠标左键单机和按下空格键)
        jtb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("我被剪辑了");
            }
        });

        //添加按钮到界面中
        jFrame.getContentPane().add(jtb);

        jFrame.setVisible(true);
    }
}
