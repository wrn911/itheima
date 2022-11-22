import java.util.ArrayList;

public class StudentTest1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + "," + list.get(i).getAge());
        }
    }
}
