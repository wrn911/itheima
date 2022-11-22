import java.util.Scanner;

public class homework9huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        int y = x;
        int sum = 0;
        //把x倒过来,与原来比较
        while(x != 0){
            int i = x % 10;
            x /= 10;
            sum = sum * 10 + i;
            System.out.println(i);
        }
        System.out.println(sum == y);
        System.out.println(sum);
        System.out.println(y);
    }
}
