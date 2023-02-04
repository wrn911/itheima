package doudizhu3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    //牌库
    static ArrayList<String> list = new ArrayList<>();
    //牌的价值
    static HashMap<String, Integer> map = new HashMap<>();

    static {
        //准备牌(只准备一副牌,因此可写在静态代码块中,只加载一次)
        //"♥","♠","♦","♣"
        //"3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♥","♠","♦","♣"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");

        map.put("J",11);
        map.put("Q",12);
        map.put("K",13);
        map.put("A",14);
        map.put("2",15);
        map.put("小王",16);
        map.put("大王",17);
    }
    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //发底牌
            if (i < 3){
                lord.add(poker);
            }
            //三个玩家轮流发牌
            if (i % 3 == 0){
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            }else {
                player3.add(poker);
            }
        }

        //排序
        sort(lord);
        sort(player1);
        sort(player2);
        sort(player3);

        //看牌
        lookPoker("玩家1",player1);
        lookPoker("玩家2",player2);
        lookPoker("玩家3",player3);
    }
    //排序
    public void sort(ArrayList<String> list){
        Collections.sort(list, new Comparator<String>() {
            //Arrays.sort(插入排序 + 二分查找)
            @Override
            public int compare(String o1, String o2) {
                //o1: 表示当前要插入的牌
                //o2: 表示已经在有序数列中存在的牌

                //负数: o1小 插入到前面
                //正数: o1大 插入到后面
                //0: o1与o2的数字一样,再按花色排序

                //1.计算o1的花色和价值
                String color1 = o1.substring(0,1);
                int value1 = getValue(o1);

                //2.计算o2的花色和价值
                String color2 = o2.substring(0,1);
                int value2 = getValue(o2);

                //比较o1和o2的价值
                int i = value1 - value2;
                return i == 0? color1.compareTo(color2) : i;
            }
        });
    }
    //计算价值
    public int getValue(String poker){
        //获取牌上的数字
        String number = poker.substring(1);//若这里要截取的是小王或大王,应想办法让他们在map中存在//可以使用" 小王"的形式
        if (map.containsKey(number)){
            //存在,获取价值
            return map.get(number);
        }else {
            //不存在,类型转换
            return Integer.parseInt(number);
        }
    }
    /**
     * name 玩家姓名
     * list 手牌
     */
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name + ": ");
        for (String poker : list) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
