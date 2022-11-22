public class homework4 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,4};
        int count = 0;
        for (int i = 0 ;i < arr.length; i++) {
            count = count * 10 + arr[i];
        }
        System.out.print(count);
    }
}
