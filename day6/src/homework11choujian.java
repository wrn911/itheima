import java.util.Random;

public class homework11choujian {
    public static void main(String[] args) {
        //定义奖金的数组
        int[] arr = {2,588,888,1000,10000};
        //定义已抽取的数组
        int[] brr = new int[arr.length];
        Random r = new Random();
        //定义一个变量用于记录
        int count = 0;
        while(count < arr.length){
            //生成随机数
            int i = r.nextInt(5);
            boolean result = fun(arr,brr,i);
            if(result){
                //如果已被抽出就继续循环
                continue;
            }else{
                //否则执行抽出操作
                System.out.println(arr[i] + "元的奖金被抽出");
                brr[i] = arr[i];
                count++;
            }
        }
    }
    //判断arr中的元素是否在brr中
    public static boolean fun(int[] arr, int[] brr,int i){
        if (arr[i] == brr[i]){
            return true;
        }else{
            return false;
        }
    }
}
