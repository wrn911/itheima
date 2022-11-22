import java.util.Scanner;

public class test5jiami {
    public static void main(String[] args) {
        //把整数存入数组
        int[] arr = saveInt();
        // +5,%10,反转
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ( arr[i] + 5 ) % 10;
        }
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //拼接出新的整数
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
            //System.out.println(number);
        }
        System.out.println("结果为" + number);
    }
    //把整数存入数组
    public static int[] saveInt(){
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        //得到数组长度
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;
        }
        //定义数组
        int[] arr = new int[count];
        //存入数组
        for (int i = arr.length - 1;i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
            //System.out.println(arr[i]);
        }
        return arr;

    }
}
