package BinarySearch;

public class test {
    public static void main(String[] args) {
        //二分查找
        int[] arr = {7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr, 81));
    }

    public static int binarySearch(int[] arr, int number) {
        //定义两个变量记录查找的范围
        int min = 0;
        int max = arr.length - 1;

        //利用循环不断去找要找的数据
        while (true) {
            if (min > max) {
                return -1;
            }
            //找到min和max的中间位置
            int mid = (min + max) / 2;
            //拿mid与number比较
            //如果number在mid左边,max应变为mid-1
            if (number < arr[mid]) {
                max = mid - 1;
            } else if (number > arr[mid]) {
                //如果number在mid右边,min变为mid+1
                min = mid + 1;
            } else {
                //如果number与mid对应元素相等,返回索引
                return mid;
            }
        }

    }

}
