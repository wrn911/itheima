package doudizhu2;

import java.util.*;

public class PokerGame {
    //牌盒 Map
    //静态只能访问静态
    //变量的生命周期仅在当前的{}中
    //此时我们只要把牌跟序号产生对应关系就行了,不需要对序号进行排序
    static HashMap<Integer,String> hm = new HashMap<>();
    //定义单列集合存储牌的序号
    static ArrayList<Integer> list = new ArrayList<>();
    //静态代码块
    //特点:随类加载而加载,而且只加载一次
    static {
        //准备牌(只准备一副牌,因此可写在静态代码块中,只加载一次)
        //"♥","♠","♦","♣"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♥","♠","♦","♣"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        //序号
        int serialNumber = 1;
        for (String n : number) {
            //n:点数
            for (String c : color) {
            //c:花色
                hm.put(serialNumber,c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        serialNumber++;
        list.add(serialNumber);
        hm.put(serialNumber,"大王");
        list.add(serialNumber);
    }
    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //发牌
        //使用treeSet,排序
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        //轮流分牌
        for (int i = 0; i < list.size(); i++) {
            //序号
            int serialNumber = list.get(i);

            if (i < 3){
                lord.add(serialNumber);
            }

            if (i % 3 == 0){
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                player2.add(serialNumber);
            }else {
                player3.add(serialNumber);
            }
        }
        //看牌
        lookPoker("底牌",lord);
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }

    /**
     *
     * @param name 玩家姓名
     * @param set 手牌
     */
    public void lookPoker(String name,TreeSet<Integer> set){
        System.out.print(name + ": ");
        for (int serialNumber : set) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
