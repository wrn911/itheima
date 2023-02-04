package com.itheima.game;

import com.itheima.domain.Poker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GameJFrame extends JFrame implements ActionListener {

    //获取界面中的隐藏容器,现在统一获取了,后面直接调用就可以了
    public static Container container = null;
    //按钮数组:抢地主或不抢
    JButton[] landlord = new JButton[2];
    //按钮数组:出牌或不要
    JButton[] publishCard = new JButton[2];
    //地主图标,表示哪位玩家是地主
    JLabel dizhu;
    //集合嵌套集合
    //大集合中有三个小集合
    //小集合中装有每个玩家当前要出的牌
    //0索引:左边的电脑玩家
    //1索引:中间的自己
    //2索引:右边的电脑玩家
    ArrayList<ArrayList<Poker>> currentList = new ArrayList<>();
    //集合嵌套集合
    //大集合中有三个小集合
    //小集合中装有每个玩家当前的手牌
    //0索引:左边的电脑玩家
    //1索引:中间的自己
    //2索引:右边的电脑玩家
    ArrayList<ArrayList<Poker>> playerList = new ArrayList<>();
    //底牌
    ArrayList<Poker> lordList = new ArrayList<>();
    //牌盒
    ArrayList<Poker> pokerList = new ArrayList();
    //管理倒计时的数组
    JTextField[] time = new JTextField[3];

    public GameJFrame() {
        //设置任务栏的图标
        setIconImage(Toolkit.getDefaultToolkit().getImage("doudizhu\\image\\poker\\dizhu.png"));
        //设置界面
        initJframe();
        //添加组件
        initView();
        //界面显示出来
        //先展示界面再发牌，因为发牌里面有动画，界面不展示出来，动画无法展示
        this.setVisible(true);

        //初始化牌
        //准备牌，洗牌，发牌，排序
        initCard();
        //打牌之前的准备工作
        //展示抢地主和不抢地主两个按钮并且再创建三个集合用来装三个玩家准备要出的牌
        initGame();
    }

    //初始化牌（准备牌，洗牌，发牌，排序）
    public void initCard() {
        //准备牌
        //外循环:确定花色
        for (int i = 1; i <= 5; i++) {
            //内循环:确定点数
            for (int j = 1; j <= 13; j++) {
                if (i == 5 && j > 2) {
                    break;
                } else {
                    //创建扑克对象
                    Poker poker = new Poker(i + "-" + j, false);
                    poker.setLocation(350,150);
                    //把扑克对象添加进数组
                    pokerList.add(poker);
                    //扑克对象添加到当前界面中
                    container.add(poker);
                }
            }
        }
        //洗牌
        Collections.shuffle(pokerList);

        //创建三个集合,统一管理每个玩家的牌
        ArrayList<Poker> player0 = new ArrayList<>();
        ArrayList<Poker> player1 = new ArrayList<>();
        ArrayList<Poker> player2 = new ArrayList<>();

        //发牌
        for (int i = 0; i < pokerList.size(); i++) {
            Poker poker = pokerList.get(i);
            if (i < 3){
                //添加底牌
                lordList.add(poker);
                Common.move(poker,poker.getLocation(),new Point(270 + (75 * i), 10));
            } else if (i % 3 == 0) {
                //给左边的电脑发牌
                Common.move(poker,poker.getLocation(),new Point(50 , 60 + i * 5));
                player0.add(poker);
            } else if (i % 3 == 1) {
                //给自己发牌
                Common.move(poker,poker.getLocation(),new Point(180 + i * 7, 450));
                player1.add(poker);
                //把自己的牌展示正面
                poker.turnFront();
            }else {
                //给右边的电脑发牌
                Common.move(poker,poker.getLocation(),new Point(700,60 + i * 5));
                player2.add(poker);
            }
            //把当前牌至于最顶端,这样就会有牌依次错开且叠起来的效果
            container.setComponentZOrder(poker,0);
        }

        //把小集合放在大集合中方便管理
        playerList.add(player0);
        playerList.add(player1);
        playerList.add(player2);

        //排序重新加载
        for (int i = 0; i < playerList.size(); i++) {
            order(playerList.get(i));
            Common.rePosition(this,playerList.get(i),i);
        }
    }

    //排序
    public void order(ArrayList<Poker> list) {
        Collections.sort(list, new Comparator<Poker>() {
            @Override
            public int compare(Poker o1, Poker o2) {
                //o1: 表示当前要插入的牌
                //o2: 表示已经在有序数列中存在的牌
                //负数: o1小 插入到前面
                //正数: o1大 插入到后面
                //0: o1与o2的数字一样,再按花色排序

                //获取o1的价值和花色
                int color1 = Integer.parseInt(o1.getName().substring(0, 1));
                int value1 = getValue(o1);
                //获取o2的价值和花色
                int color2 = Integer.parseInt(o2.getName().substring(0, 1));
                int value2 = getValue(o2);
                //比较价值(注意在图形化界面中显示的扑克应该是左大右小)
                int result = value2 - value1;
                //如果价值相同就比较花色
                return result == 0? color2 - color1 : result;
            }
        });
    }

    //获取每一张牌的价值
    public int getValue(Poker poker) {
        String name = poker.getName();
        int value = Integer.parseInt(name.substring(2));;

        //先处理大小王
        if (name.equals("5-1")){
            value = 16;
        } else if (name.equals("5-2")) {
            value = 17;
        } else if (value == 1) {
            //表示扑克A
            value = 14;
        } else if (value == 2) {
            //表示扑克2
            value = 15;
        }
        return value;
    }


    //打牌之前的准备工作
    private void initGame() {
        //创建三个集合用来装三个玩家准备要出的牌
        for (int i = 0; i < 3; i++) {
            ArrayList<Poker> list = new ArrayList<>();
            //添加到大集合中方便管理
            currentList.add(list);
        }

        //展示抢地主和不抢地主两个按钮
        landlord[0].setVisible(true);
        landlord[1].setVisible(true);

        //展示自己前面的倒计时文本
        for (JTextField field : time) {
            field.setText("倒计时30秒");
            field.setVisible(true);
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    //添加组件
    public void initView() {
        //创建抢地主的按钮
        JButton robBut = new JButton("抢地主");
        //设置位置
        robBut.setBounds(320, 400, 75, 20);
        //添加点击事件
        robBut.addActionListener(this);
        //设置隐藏
        robBut.setVisible(false);
        //添加到数组中统一管理
        landlord[0] = robBut;
        //添加到界面中
        container.add(robBut);

        //创建不抢的按钮
        JButton noBut = new JButton("不抢");
        //设置位置
        noBut.setBounds(420, 400, 75, 20);
        //添加点击事件
        noBut.addActionListener(this);
        //设置隐藏
        noBut.setVisible(false);
        //添加到数组中统一管理
        landlord[1] = noBut;
        //添加到界面中
        container.add(noBut);

        //创建出牌的按钮
        JButton outCardBut = new JButton("出牌");
        outCardBut.setBounds(320, 400, 60, 20);
        outCardBut.addActionListener(this);
        outCardBut.setVisible(false);
        publishCard[0] = outCardBut;
        container.add(outCardBut);

        //创建不要的按钮
        JButton noCardBut = new JButton("不要");
        noCardBut.setBounds(420, 400, 60, 20);
        noCardBut.addActionListener(this);
        noCardBut.setVisible(false);
        publishCard[1] = noCardBut;
        container.add(noCardBut);


        //创建三个玩家前方的提示文字：倒计时
        //每个玩家一个
        //左边的电脑玩家是0
        //中间的自己是1
        //右边的电脑玩家是2
        for (int i = 0; i < 3; i++) {
            time[i] = new JTextField("倒计时:");
            //设置不可编辑
            time[i].setEditable(false);
            time[i].setVisible(false);
            container.add(time[i]);
        }
        time[0].setBounds(140, 230, 60, 20);
        time[1].setBounds(374, 360, 60, 20);
        time[2].setBounds(620, 230, 60, 20);


        //创建地主图标
        dizhu = new JLabel(new ImageIcon("doudizhu\\images\\poker\\dizhu.png"));
        dizhu.setVisible(false);
        dizhu.setSize(40, 40);
        container.add(dizhu);

    }

    //设置界面
    public void initJframe() {
        //设置标题
        this.setTitle("斗地主");
        //设置大小
        this.setSize(830, 620);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口无法进行调节
        this.setResizable(false);
        //界面居中
        this.setLocationRelativeTo(null);
        //获取界面中的隐藏容器，以后直接用无需再次调用方法获取了
        container = this.getContentPane();
        //取消内部默认的居中放置
        container.setLayout(null);
        //设置背景颜色
        container.setBackground(Color.LIGHT_GRAY);
    }


}