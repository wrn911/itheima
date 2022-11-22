package BasicSearch;

public class test1 {
    public static void main(String[] args) {
        //定义一个方法利用基本查找,查询某个元素在数组中的索引
        //不需要考虑元素有重复的可能
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int number = 81;
        int result = basicSearch(arr, number);
        System.out.println(result);

    }

    public static int basicSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
