import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class demo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-15","周芷若-14","赵敏-13","张强-30","张三丰-100","张村山-35","张良-35","王二麻子-40","谢广坤-41");

        //需求:只获取里面的年龄并打印
        // String -> int

        //第一个类型:流中原本的数据类型
        //第二个类型:要转成的类型

        //apply的形参s:依次表示流里面的每一个数据
        //返回值:表示转换之后的数据
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));
        System.out.println("-------------------------");
        list.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));
    }
}
