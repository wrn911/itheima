public class homework8 {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,7,8,9,2,3,1,3,23,424};
        fill(arr,3,7,0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void fill(int[] arr,int fromIndex,int toIndex,int value){
        for (int i = fromIndex - 1; i < toIndex - 1; i++) {
            arr[i] = value;
        }
    }
}
