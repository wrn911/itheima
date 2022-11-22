import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        //原数组
        int[] arr = {12,14,23,45,66,68,70,77,90,91};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("请输入一个整数 ");

        //录入整数数字
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //定义新数组
        int[] brr = new int[arr.length + 1];
        //找到number对应的数据
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = i;
            if(arr[i] > number){
                //System.out.println(i);
                break;
            }
        }
        //System.out.println(count);
        brr[count] = number;
        //处理整数前的元素
        for (int i = 0; i < count; i++) {
            brr[i] = arr[i];
        }
        //处理整数后的元素
        for (int i = brr.length - 1; i > count;  i--) {
            brr[i] = arr[i - 1];
        }
        //遍历,打印
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
