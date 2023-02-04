package com.itheima.domain;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
    //属性
    //1.名称 数字-数字
    private String name;
    //2.正面还是反面
    private boolean up;
    //3.是否可以被点击
    private boolean canClick = false;
    //4.是否已被点击
    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;

        //设置正反面
        if (this.up) {
            //正面
            turnFront();
        } else {
            //反面
            turnRear();
        }

        //设置宽高
        this.setSize(71,96);
        //设置可见
        this.setVisible(true);
        //添加鼠标监听
        this.addMouseListener(this);//this表示调用本类中重写的监听方法
    }

    //方法
    //设置正面
    public void turnFront() {
        this.setIcon(new ImageIcon("doudizhu\\image\\poker\\" + name + ".png"));
    }

    //设置反面
    public void turnRear() {
        this.setIcon(new ImageIcon("doudizhu\\image\\poker\\rear.png"));
    }

    //点击事件
    @Override
    public void mouseClicked(MouseEvent e) {
        //判断是否可被点击
        if (canClick){
            //记录要移动的像素数
            int step;

            //判断是否已被点击
            if (clicked){
                //已被点击,执行升起操作
                step = 20;
            }else {
                //未被点击,执行落下操作
                step = -20;
            }

            //修改clicked变量记录的值
            clicked = !clicked;

            //移动操作
            //获取当前位置
            Point from = this.getLocation();
            //新位置
            Point to = new Point(from.x, from.y + step);
            //设置新位置
            this.setLocation(to);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return up
     */
    public boolean isUp() {
        return up;
    }

    /**
     * 设置
     *
     * @param up
     */
    public void setUp(boolean up) {
        this.up = up;
    }

    /**
     * 获取
     *
     * @return canClick
     */
    public boolean isCanClick() {
        return canClick;
    }

    /**
     * 设置
     *
     * @param canClick
     */
    public void setCanClick(boolean canClick) {
        this.canClick = canClick;
    }

    /**
     * 获取
     *
     * @return clicked
     */
    public boolean isClicked() {
        return clicked;
    }

    /**
     * 设置
     *
     * @param clicked
     */
    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public String toString() {
        return "Poker{name = " + name + ", up = " + up + ", canClick = " + canClick + ", clicked = " + clicked + "}";
    }
}
