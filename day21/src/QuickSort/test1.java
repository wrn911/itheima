package QuickSort;

import java.util.Random;

public class test1 {
    /*
       快速排序：
           第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
           比基准数小的全部在左边，比基准数大的全部在右边。
           后面以此类推。
     */
    public static void main(String[] args) {
        //int[] arr = {3, 5, 2, 7, 6, 9, 8, 1, 2, 10};
        int[] arr  = new int[10000];

        Random r = new Random();

        //计时器
        long start = System.currentTimeMillis();
        for (int j : arr) {
            j = r.nextInt();
        }

        quickSort(arr,0,arr.length - 1);
        long end = System.currentTimeMillis();

        System.out.println(end - start);


    }

    /*
     *   参数一：我们要排序的数组
     *   参数二：要排序数组的起始索引
     *   参数三：要排序数组的结束索引
     * */
    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;

        //递归出口
        if (start >= end) {
            return;
        }

        while (start != end) {
            //循环出口
            //start= end

            while (arr[end] >= arr[i] && end > start) {
                end--;
            }

            while (arr[start] <= arr[i] && end > start) {
                start++;
            }

            //互换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        //递归调用
        //对基准数右边数据进行排序
        quickSort(arr, start + 1, j);
        //对基准数左边数据进行排序
        quickSort(arr, i, end - 1);
    }
}
