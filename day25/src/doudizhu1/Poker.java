package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    //牌盒
    //静态只能访问静态
    //变量的生命周期仅在当前的{}中
    static ArrayList<String> list = new ArrayList<>();
    //静态代码块
    //特点:随类加载而加载,而且只加载一次
    static {
        //准备牌(只准备一副牌,因此可写在静态代码块中,只加载一次)
        //"♥","♠","♦","♣"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♥","♠","♦","♣"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};


        for (String c : color) {
            //c:花色
            for (String n : number) {
                //n:点数
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }
    public Poker(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //轮流分牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i < 3){
                lord.add(poker);
            }

            if (i % 3 == 0){
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            }else {
                player3.add(poker);
            }
        }
        //看牌
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }

    /**
     *
     * @param name 玩家姓名
     * @param list 手牌
     */
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
