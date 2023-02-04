import java.util.Comparator;
import java.util.TreeMap;

public class test3 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        map.put(2,"a");
        map.put(4,"afg");
        map.put(3,"d");
        map.put(6,"s");
        map.put(9,"af");
        map.put(5,"ae");
        map.put(7,"w");
        map.put(1,"e");

        //Integer Double默认情况下升序排列
        //String按字母顺序排
        System.out.println(map);
    }
}
