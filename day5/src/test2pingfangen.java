import java.util.Scanner;

public class test2pingfangen {
    public static void main(String[] args) {
        //分析:求平方根的整数部分
        /*例子:
        求10的平方根
        1 * 1 = 1 < 10
        2 * 2 = 4 < 10
        3 * 3 = 9 < 10
        4 * 4 = 16 > 10
        则10的平方根在3和4之间
         */

        /*分析:
        只需要从一开始不断平方
        当平方小于输入的数字时,继续执行
        当平方等于指定数字时,即为平方根
        当平方大于平方根时,平方的前一个数字即为平方根
         */

        //键盘录入数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int number = sc.nextInt();
        //循环判断,开始为1,结束为number
        for (int i = 1; i <= number; i++) {
            if(i * i == number){
                System.out.println( number+ "的平方根是" + i);
                break;
            }else if(i * i >= number){
                System.out.println( number+ "的平方根的整数部分是" + (i - 1));
                break;
            }

        }
    }
}
