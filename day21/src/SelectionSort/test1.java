package SelectionSort;

public class test1 {
    public static void main(String[] args) {
        //选择排序
        //从0索引开始,跟后面的元素一一比较
        //小的放前面,大的放后面
        int[] arr = {2,4,5,3,1};
        //外循环:表示一共执行多少轮
        //i:这一轮中,我拿着那个索引的数据与后面的数据进行比较
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环:每一轮执行的事情
            //拿i跟i后面的数据进行比较
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
