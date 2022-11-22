import java.util.Scanner;

public class test3质数 {
    public static void main(String[] args) {
        //分析
        //录入数字
        System.out.println("请输入一个正整数:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //标记思想
        boolean flag = true;
        //判断是否能被2到number-1的数整除
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(number + "是一个质数");
        }else{
            System.out.println(number + "不是一个质数");
        }


    }
}
