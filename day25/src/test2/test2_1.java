package test2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 实现概率
 */

public class test2_1 {
    public static void main(String[] args) {

        //定义表示概率的集合
        ArrayList<Integer> list = new ArrayList<>();
        //添加数据  0 ---> 男生
        //        1 ---> 女生
        Collections.addAll(list,0,0,0,0,0,0,0);
        Collections.addAll(list,1,1,1);

        //打乱集合,获取随机数,表示是男生还是女生
        Collections.shuffle(list);
        int i = list.get(0);

        //创建男女生集合
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList,"澄邈","德泽","海超","海阳","海荣","海逸","海昌","瀚钰","瀚文");
        Collections.addAll(girlList,"恨桃","依秋","依波","香巧","紫萱");

        //判断是该抽取男生还是女生
        if(i == 0){
            //男生
            Collections.shuffle(boyList);
            System.out.println(boyList.get(0));
        }else {
            //女生
            Collections.shuffle(girlList);
            System.out.println(girlList.get(0));
        }
    }
}
