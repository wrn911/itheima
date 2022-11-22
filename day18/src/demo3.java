import java.util.Objects;

public class demo3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s = null;
        System.out.println(s == s1);
        System.out.println(Objects.equals(s, s1));
    }
}
