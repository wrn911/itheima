package BasicSearch;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        //定义一个方法利用基本查找,查询某个元素在数组中的索引
        //需要考虑元素有重复的可能
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int number = 81;
        ArrayList<Integer> result = basicSearch(arr, number);
        System.out.println(result);
    }

    public static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
