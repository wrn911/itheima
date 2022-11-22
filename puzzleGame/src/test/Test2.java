package test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //打乱一维数组数据,并将其添加到二维数组中
        //定义一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数据
        //打乱,获取数组中的每一个元素,并将其与一个随机索引交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int Index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[Index];
            tempArr[Index] = temp;
        }
        //创建二维数组
        int[][] data = new int[4][4];
        //添加数据
        //解法二:遍历二维数组
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int i1 = 0; i1 < data[i].length; i1++) {
                data[i][i1] = tempArr[index];
                index++;
            }
        }
        //遍历数组
        for (int i = 0; i < data.length; i++) {
            for (int i1 = 0; i1 < data[i].length; i1++) {
                System.out.print(data[i][i1] + " ");
            }
            System.out.println();
        }
    }
}
