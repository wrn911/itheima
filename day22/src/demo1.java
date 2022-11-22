import java.util.ArrayList;
import java.util.Collection;

public class demo1 {
    public static void main(String[] args) {
        //Collection演示
        Collection<String> coll = new ArrayList<>();

        boolean aaa = coll.add("aaa");
        boolean bbb = coll.add("bbb");
        boolean ccc = coll.add("ccc");

        System.out.println(aaa);
        System.out.println(bbb);
        System.out.println(ccc);

        System.out.println(coll);

        boolean aaa1 = coll.remove("aaa");
        System.out.println(aaa1);

        System.out.println(coll.contains("aaa"));
        System.out.println(coll.contains("bbb"));

        System.out.println(coll.size());

        coll.clear();

        System.out.println(coll.size());
    }
}
