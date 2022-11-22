package try1;

public class test {
    public static void main(String[] args) {
        Student.method();
        Student s = new Student();
        s.name="zhangsan";
        s.age = "23";
        s.show();
        s.method();
        s.teacherName = "1";
        s.show();
    }
}
