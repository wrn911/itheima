import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo2 {
    //迭代器
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        Iterator<String> it = coll.iterator();

        while (it.hasNext()){
            String str = it.next();
            if ("aaa".equals(str)){
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println(coll);
    }
}
