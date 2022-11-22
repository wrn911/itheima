package InsertSort;

public class test1 {
    public static void main(String[] args) {
        //插入排序
        int[] arr = {3,44,38,24,35,53,23,67,53,3,2,564,93};

        //获取无序组的的开始索引
        int startIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }

        //遍历从startIndex开始到最后一个元素,依次得到无序组的每一个元素
        for (int i = startIndex; i < arr.length; i++) {
            //记录当前要插入数据的索引
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j -1];
                arr[j - 1] = temp;
                j--;
            }
            for (int i1 = 0; i1 < arr.length; i1++) {
                System.out.print(arr[i1] + " ");
            }
            System.out.println();
        }
    }
}
