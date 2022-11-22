public class test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean result = contains(arr,4);
        System.out.println(result);
    }
    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                return true;
            }
        }
        return false;
    }
}
