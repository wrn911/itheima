import java.util.TreeSet;

public class demo9TreeSet {
    public static void main(String[] args) {
        //创建对象
        Student2 s1 = new Student2("zhangsan",13,92,94,99);
        Student2 s2 = new Student2("lisi",14,93,23,96);
        Student2 s3 = new Student2("wangwu",15,68,72,98);
        Student2 s4 = new Student2("zhaoliu",16,85,39,93);
        Student2 s5 = new Student2("qianqi",17,79,88,95);
        //创建集合
        TreeSet<Student2> ts = new TreeSet<>();

        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //System.out.println(ts);

        //遍历
        for (Student2 t : ts) {
            System.out.println(t);
        }
    }
}
