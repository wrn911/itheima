import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class demo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张村山","张良","王二麻子","谢广坤");

        //获取张开头的数据
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为true:表示当前数据留下
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("-----------------------------------");
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        System.out.println("------------------------------------");
        //跳过
        list.stream().skip(3).forEach(s -> System.out.println(s));
        //获取前三个
        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------------");
        //获取中间
        //法1
        list.stream().limit(6).skip(3).forEach(s -> System.out.println(s));
        //法2
        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));


    }
}
