import java.util.TreeSet;

public class demo7TreeSet {
    public static void main(String[] args) {
        //第一种排序,默认排序,自然排序
        //创建对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhaoliu", 26);

        //创建集合
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s3);
        ts.add(s2);
        ts.add(s1);
        ts.add(s4);

        System.out.println(ts);
    }
}
