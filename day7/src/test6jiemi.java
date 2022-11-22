public class test6jiemi {
    public static void main(String[] args) {
        int[] arr = {8,3,4,6};
        //反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //解密除以10取余.经分析可知,5到9对10取余后是本身,0到4对10取余后是各位
        //+5
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <=4){
                arr[i] += 10;
            }
            arr[i] -= 5;
        }
        //拼接
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        System.out.println(number);
    }
}
