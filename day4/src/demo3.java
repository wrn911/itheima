import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        //请输入一个整数表示票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数表示票号");
        int ticket = sc.nextInt();
        //只有1~100才是有效的票号
        if(ticket > 0 && ticket <= 100){
            //奇数做左边,偶数坐右边
            if (ticket % 2 == 1){
                System.out.println("坐左边");
            }else{
                System.out.println("坐右边");
            }
        }
    }
}
