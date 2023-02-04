package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        //核心点:如果键存储的是自定义对象,需要重写hashcode和equals方法
        Map<Student,String> map = new HashMap<>();

        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",24);
        Student s3 = new Student("王五",25);
        Student s4 = new Student("王五",25);

        map.put(s1,"河北");
        map.put(s2,"山西");
        map.put(s3,"甘肃");
        map.put(s4,"辽宁");

        //遍历
        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println("========================================================");
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry);
        }
        System.out.println("========================================================");
        map.forEach((key,value) -> System.out.println(key + " = " +  value));
    }
}
