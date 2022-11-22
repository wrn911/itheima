import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        //键盘录入
        System.out.println("请输入一个三位数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //分离
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        //求和
        int addition = ge + shi + bai;
        System.out.println(addition);
    }
}
