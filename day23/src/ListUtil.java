import java.util.ArrayList;
import java.util.Arrays;

public class ListUtil {
    //工具类要私有化构造方法
    private ListUtil(){};

    public static <E> void addAll(ArrayList<E> list,E e1,E e2, E e3){
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }

    //可变参数
    public static <E> void addAll(ArrayList<E> list,E...e){
        for (E e1 : e) {
            list.add(e1);
        }
    }
}
