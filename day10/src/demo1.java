import java.sql.SQLOutput;

public class demo1 {
    public static void main(String[] args) {
        //1
        String s1 = "abc";
        System.out.println(s1);

        //2.1
        String s2 = new String();
        System.out.println("!" + s2 + "!");

        //2.2
        String s3 = new String("abc");
        System.out.println(s3);

        //2.3
        char[] chs = {'a','b','c','d'};
        String s4 = new String(chs);
        System.out.println(s4);

        //2.4
        byte[] bytes = {97,98,99};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
