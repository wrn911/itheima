import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        //输入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        //对这两个数字进行比较,确定范围
        int big;
        int small;
        if(number1 > number2){
            big = number1;
            small = number2;
        }else{
            big = number2;
            small = number1;
        }
        //循环求满足条件的数字,用if语句判断
        int sum = 0;
        for (int i = small; i <= big; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
