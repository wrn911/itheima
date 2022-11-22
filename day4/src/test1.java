import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //输入两个数字表示范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字表示范围的开始:");
        int start = sc.nextInt();
        System.out.println("请输入一个数字表示范围的结束:");
        int end= sc.nextInt();

        int count = 0;
        //利用循环处理每一个数字
        for(int i = start; i <= end; i++){
            //判断
            if(i % 3 == 0 && i % 5 == 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);

    }
}
