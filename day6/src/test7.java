public class test7 {
    public static void main(String[] args) {
        //将数组中从索引from(包括from)开始,到索引to结束(不包括to)的元素复制到新数组中
        //定义数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //接收返回值
        int[] copyArr = copyOfRange(arr, 3, 7);
        //遍历数组
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

    //定义方法
    public static int[] copyOfRange(int[] arr, int from, int to) {
        //定义新数组
        int[] newArr = new int[to - from];
        //遍历,复制
        //伪造索引思想
        int index = 0;
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
