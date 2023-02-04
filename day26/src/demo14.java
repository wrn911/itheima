import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class demo14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");

        //转为大写
        /*list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(s -> System.out.println(s));*/

        //拿着流里面的每一个数据,去调用String里的toUpperCase方法,方法返回值就是转换之后的结果
        list.stream().map(String::toUpperCase).forEach(s -> System.out.println(s));
    }
}
