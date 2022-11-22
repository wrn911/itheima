public class homework10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int[] newArr = copyOf(arr, 4,7);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static int[] copyOf(int[] arr, int from , int to){
        //创建新数组
        int[] newArr = new int[to - from];
        //伪造索引
        int index = 0;
        for (int i = from - 1; i < to - 1; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}

