package test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.BiConsumer;

public class test2 {
    public static void main(String[] args) {
        //核心:判断集合中是否包含该元素

        //1.先让学生们投票,可以用随机数模拟(查表法)
        String[] arr = {"A","B","C","D","E","F","G","H"};
        Random r = new Random();
        //定义列表,存储结果
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 8000; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //2.定义map,统计结果
        Map<String,Integer> map = new HashMap<>();
        //添加元素
        for (String name : list) {
            if (map.containsKey(name)){
                //存在
                //获取票数
                int count = map.get(name);
                //票数加一
                count++;
                //存回map中
                map.put(name,count);
            }else {
                //不存在
                map.put(name,1);//投了一次票
            }
        }
        System.out.println(map);
        //3.求最大值
        int max = 0;
        //A、方法内部类只能在定义该内部类的方法内实例化，不可以在此方法外对其实例化。
        //B、方法内部类对象不能使用该内部类所在方法的非final局部变量。
        //因为方法的局部变量位于栈上，只存在于该方法的生命期内。当一个方法结束，其栈结构被删除，局部变量成为历史。但是该方法结束之后，
        //在方法内创建的内部类对象可能仍然存在于堆中！例如，如果对它的引用被传递到其他某些代码，并存储在一个成员变量内。
        //正因为不能保证局部变量的存活期和方法内部类对象的一样长，所以内部类对象不能使用它们。
        /*map.forEach((String name, Integer count) ->{
                if (count > max) {
                    max = count;
                }
            }
        );*/
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();
            if (count > max){
                max = count;
            }
        }
        //打印最大值对应的景点
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer count = entry.getValue();
            if (count == max){
                System.out.println(entry.getKey());
            }
        }
    }
}
