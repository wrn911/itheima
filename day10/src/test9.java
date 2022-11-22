import java.util.StringJoiner;

public class test9 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("-----","[","]");

        sj.add("123").add("dd").add("asda");

        System.out.println(sj);
    }
}
