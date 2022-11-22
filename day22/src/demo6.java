import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class demo6 {
    public static void main(String[] args) {
        //列表迭代器
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String next = listIterator.next();
            System.out.println(next);
            if (next.equals("bbb")){
                listIterator.add("eee");
            }
        }
        System.out.println(list);

        //逆向遍历
        while (listIterator.hasPrevious()){
            String previous = listIterator.previous();
            System.out.println(previous);
            if (previous.equals("bbb")){
                listIterator.add("eee");
            }
        }
        System.out.println(list);

    }
}
