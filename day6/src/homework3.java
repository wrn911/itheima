import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.print("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.print("请输入第三个整数:");
        int c = sc.nextInt();
        System.out.print("从大到小的顺序为:");
        paiXu(a,b,c);
    }
    public static void paiXu(int a,int b , int c){
        int max = a > b? a : b;
        max = max > c? max : c;
        int min = a < b? a: b ;
        min = min < c ? min : c;
        int mid = a + b + c - max - min;
        System.out.print(max + " " + mid + " " + min );

    }

}
