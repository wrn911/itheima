import java.util.ArrayList;
import java.util.List;

public class demo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //插入
        list.add(1,"eee");
        System.out.println(list);
        System.out.println("----------------------");

        //删除
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println("----------------------");

        //修改
        System.out.println(list.set(1, "eee"));
        System.out.println(list);
        System.out.println("----------------------");

    }
}
