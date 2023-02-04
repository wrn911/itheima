import java.util.InputMismatchException;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        int age = 0;
        String name = "";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入姓名: ");
            name = sc.next();
            if (name.length() > 10 || name.length() < 3) {
                System.out.println("姓名不合法");
                continue;
            }
            break;
        }
        while (true) {
            System.out.println("请输入年龄: ");
            try {
                age = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("年龄中不能含有其他字符");
                sc.next();
                continue;
            }
            if (age < 18 || age > 40) {
                System.out.println("年龄不合法");
                continue;
            }
            break;
        }
        System.out.println(name);
        System.out.println(age);
    }
}
