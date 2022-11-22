package demo2;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("zhangsan",23,"boy");
        Student s2 = new Student("lisi",24,"girl");
        Student s3 = new Student("wangwu",25,"boy");

        //添加进集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        int studentMaxAge = StudentUtil.getStudentMaxAge(list);
        System.out.println(studentMaxAge);
    }
}
