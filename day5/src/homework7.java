public class homework7 {
    public static void main(String[] args) {
        //定义原数组,新数组
        int[] arr = {1,2,3,4,5,6,7,8,9,342,133,45,32,31};
        int[] brr = new int[arr.length];
        //定义变量记录奇数偶数
        int ji = 0;
        int ou = arr.length - 1;
        //循环判断奇偶,并存放至新数组对应位置
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                brr[ou] = arr[i];
                ou--;
            }else{
                brr[ji] = arr[i];
                ji++;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
