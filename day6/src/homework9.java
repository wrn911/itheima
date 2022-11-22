public class homework9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int[] newArr = copyOf(arr, 4);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static int[] copyOf(int[] arr, int newLength){
        //创建新数组
        int[] newArr = new int[newLength];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
