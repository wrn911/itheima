import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
        //输入除数和被除数
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int dividend = sc.nextInt();
        System.out.print("请输入除数:");
        int divisor = sc.nextInt();
        //定义商和余数
        int shang = 0;
        int yushu;
        while(dividend > divisor){
            shang++;
            dividend -= divisor;
        }
        yushu = dividend;
        System.out.println("商为" + shang);
        System.out.println("余数为" + yushu);
    }
}
