import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        /*//录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //依次比较
        int small = a < b? a : b ;
        int smallest = small < c? small : c ;
        System.out.println(smallest);*/

        //录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //比较
        int small;
        int smallest;
        small = Math.min(a,b);
        smallest = Math.min(small,c);
        System.out.println(smallest);
    }
}
