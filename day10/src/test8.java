import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        String result = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(result));
    }
}
