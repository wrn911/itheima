import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class demo6TreeSet {
    public static void main(String[] args) {
        //创建对象
        TreeSet<Integer> ts = new TreeSet<>();

        //添加元素
        ts.add(1);
        ts.add(2);
        ts.add(4);
        ts.add(7);
        ts.add(3);
        ts.add(6);
        ts.add(9);

        //打印
        System.out.println(ts);
        System.out.println("---------------------------------------------");

        //遍历
        //迭代器
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
        System.out.println("---------------------------------------------");

        //增强for
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("---------------------------------------------");

        //lambda
        ts.forEach(integer -> System.out.println(integer));
        System.out.println("---------------------------------------------");

        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }

}
