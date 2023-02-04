import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

//静态方法引用
public class demo11 {
    public static void main(String[] args) {
        //把集合中的数字转为整数类型
        //"1","2","3","4","5","6"
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5","6");

        /*list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                int i = Integer.parseInt(s);
                return i;
            }
        }).forEach(s -> System.out.println(s));*/

        list.stream().map(Integer::parseInt).forEach(s -> System.out.println(s));
    }
}
