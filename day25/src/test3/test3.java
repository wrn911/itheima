package test3;

import java.util.ArrayList;
import java.util.Collections;

public class test3 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<String> nameList1 = new ArrayList<>();
        ArrayList<String> nameList2 = new ArrayList<>();

        //添加数据
        Collections.addAll(nameList1,"澄邈","德泽","海超","海阳","海荣","海逸","海昌","瀚钰","恨桃","依秋","依波","香巧","紫萱");

        //随机点名
        for (int i = 0; i < 100; i++) {
            if (nameList1.size() == 0){
                //全部点完,执行下一轮
                //重新给nameList1添加初值
                nameList1 = nameList2;
                //用于记录已被点名的名单清空
                nameList2 = new ArrayList<>();
                System.out.println("--------------------------------------------------------------------------");
            }
            //随机点名
            Collections.shuffle(nameList1);
            String name = nameList1.get(0);
            //已被点名的同学清除出列表
            nameList1.remove(name);
            //记录已被点名的同学
            nameList2.add(name);
            System.out.println(name);
        }

    }
}
