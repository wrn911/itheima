package BubbleSort;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        //冒泡排序
        //相邻数据两两比较,大的放右边小的放左边
        //第一轮比较完毕后,最大值就以确定,第二轮就可以少循环一次,以此类推
        int[] arr = {2, 4, 5, 3, 1};

        //外循环:表示我要执行多少轮,如果有n个数据,就执行n-1轮
        for (int j = 0; j < arr.length - 1; j++) {
            //内循环:每一轮中我如何比较数据并找到当前的最大值
            //-j:提高效率,每一轮执行的次数应该比上一轮少一次
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            //遍历数组
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
