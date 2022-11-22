import java.util.Scanner;

public class huiwentest3 {
    public static void main(String[] args) {
        //核心思路:把数倒过来与原来比较
        System.out.println("判断是否是回文数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = x;
        //定义一个变量储存倒过来之后的数
        int num = 0;
        //利用循环把数倒过来
        while(x != 0){
            //取个位
            int ge = x % 10;
            //改变x
            x /= 10;
            //获得倒过来之后的数
            num = num * 10 + ge;
        }
        System.out.println(num);
        boolean result = (num == temp);
        System.out.println(result);
    }
}
