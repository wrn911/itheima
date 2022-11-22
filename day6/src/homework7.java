public class homework7 {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,7,8,9};
        fill(arr,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }
}
