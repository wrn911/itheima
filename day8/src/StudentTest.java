import java.sql.SQLOutput;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        //Student s = new Student("二哈", 18);

        s.setAge(18);
        s.setName("二哈");

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
