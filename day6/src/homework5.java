import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int num = sc.nextInt();
        int count = weiShu(num);
        System.out.print("控制台输出:" + num + "是" + count + "位数字");
    }
    public static int weiShu(int number){
        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
        }
        return count;
    }
}
