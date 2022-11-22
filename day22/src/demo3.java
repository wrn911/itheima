import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class demo3 {
    //lambda表达式遍历
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        //利用匿名内部类的形式遍历集合
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //利用lambda表达式的形式遍历集合
        coll.forEach(s -> System.out.println(s));
    }
}
