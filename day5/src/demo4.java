import java.util.Random;

public class demo4 {
    public static void main(String[] args) {
        //动态初始化数组
        int[] arr = new int[10];
        //随机数,循环存入数组
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        //求和,求平均数
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg = sum / arr.length;
        //遍历,与平均数相比较
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println("一共有" + count + "个数据小于平均数");
    }
}
