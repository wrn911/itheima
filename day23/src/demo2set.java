import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo2set {
    public static void main(String[] args) {
        //创建一个set集合的对象
        Set<String> s = new HashSet<>();

        //添加元素
        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");

        //打印集合
        System.out.println(s);

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.print(next + " ");
        }
        System.out.println();

        //增强for遍历
        for (String s1 : s) {
            System.out.print(s1 + " ");
        }
        System.out.println();

        //lambda遍历
        s.forEach(str -> System.out.print(str + " "));
    }
}
