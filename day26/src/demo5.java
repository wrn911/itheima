import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class demo5 {
    public static void main(String[] args) {
        //单列集合获取stream流
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7);
        //遍历
        Stream<Integer> stream = list.stream();
        stream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                //integer:依次表示流水线上的每一个数据
                System.out.println(integer);
            }
        });
        System.out.println("----------------------------------------------------------");
        //双列集合获取stream流
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,1);
        hm.put(3,1);
        hm.put(4,1);
        hm.put(5,1);
        hm.put(6,1);
        hm.put(7,1);
        hm.put(8,1);
        hm.put(9,1);
        hm.put(10,1);
        hm.put(11,1);
        hm.put(12,1);
        hm.put(13,1);
        hm.keySet().stream().forEach(i -> System.out.println(i + "=" + hm.get(i)));
        System.out.println("----------------------------------------------------------");
        hm.entrySet().stream().forEach(e -> System.out.println(e));
        System.out.println("----------------------------------------------------------");

        //数组获取stream流
        int[] arr = {1,2,3,4,5};
        String[] arr1 = {"a","b","c"};

        Arrays.stream(arr).forEach(i -> System.out.println(i));
        Arrays.stream(arr1).forEach(s -> System.out.println(s));
        System.out.println("----------------------------------------------------------");

        //零散数据获取stream流
        Stream.of("a","b","c").forEach(s -> System.out.println(s));
        Stream.of(1,2,3).forEach(i -> System.out.println(i));
    }
}
