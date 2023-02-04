import test1.Student;
import java.util.TreeMap;

public class test4 {
    public static void main(String[] args) {
        TreeMap<Student,String> map = new TreeMap<>();

        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s1 = new Student("张三",23);
        Student s4 = new Student("王五",25);

        map.put(s1,"河北");
        map.put(s2,"山西");
        map.put(s3,"甘肃");
        map.put(s4,"辽宁");

        System.out.println(map);

    }
}
