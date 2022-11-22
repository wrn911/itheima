import java.util.Random;

public class test7choujiangyouhua {
    public static void main(String[] args) {
        //把奖池中的数据打乱顺序
        int[] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成随机索引
            int randomIndex = r.nextInt(5);
            //随机索引与i交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //遍历打印
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "元已被抽出");
        }
    }
}
