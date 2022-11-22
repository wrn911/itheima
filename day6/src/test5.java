public class test5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int max = getMax(arr);
        System.out.print(max);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}