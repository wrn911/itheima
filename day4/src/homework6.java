import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数:");
        int first = sc.nextInt();
        System.out.print("请输入第二个整数:");
        int secound = sc.nextInt();
        System.out.print("请输入你要执行的操作(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int operation = sc.nextInt();
        int result = 0;
        String sign = " ";
        switch (operation){
            case 1:
                result = first + secound;
                sign = "+";
                break;
            case 2:
                result = first - secound;
                sign = "-";
                break;
            case 3:
                result = first * secound;
                sign = "*";
                break;
            case 4:
                result = first / secound;
                sign = "/";
                break;
            default:
                System.out.println("输入的数字不合法");
                break;
        }
        System.out.println(first + sign + secound + '=' + result);
    }
}
