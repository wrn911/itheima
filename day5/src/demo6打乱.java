import java.util.Random;

public class demo6打乱 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //循环遍历数组,将数组中的元素依次与随机索引交换
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //遍历,打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
