public class demo5头尾交换 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {1,2,3,4,5};
        //利用循环交换数据
        for(int i = 0,j = arr.length - 1;i < j;i++,j-- ){
            //交换变量i和j指向的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //当循环结束后,数组中的数据就实现了头尾交换
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
