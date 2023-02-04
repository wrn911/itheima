package test4;

import java.util.*;

public class test4 {
    public static void main(String[] args) {
        //定义集合
        Map<String, ArrayList<String>> map = new TreeMap<>();
        //定义集合存储城市
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();

        //添加数据
        map.put("江苏", list1);
        map.put("浙江", list2);
        map.put("安徽", list3);
        map.put("福建", list4);
        map.put("江西", list5);

        Collections.addAll(list1, "南京", "无锡", "徐州", "常州");
        Collections.addAll(list2, "杭州", "宁波", "温州", "绍兴");
        Collections.addAll(list3, "合肥", "芜湖", "蚌埠", "淮南");
        Collections.addAll(list4, "福州", "莆田", "泉州", "厦门");
        Collections.addAll(list5, "南昌", "赣州", "宜春", "吉安");

        map.forEach((name,list) -> {
            System.out.print(name + " = ");
            StringJoiner sj = new StringJoiner(", ");
            for (String s : list) {
                sj.add(s);
            }
            System.out.println(sj);
        });
    }
}
