public class demo3最值 {
    public static void main(String[] args) {
        //max初始化值一定是数组中的值


        //定义数组
        int[] arr = {1,24,32,42,5};
        //临时认为0索引的数据是最大的
        int max = arr[0];
        //循环获取数据,依次与max比较,将大的数存入max
        //循环的开始条件可以写1,从而避免自己与自己比较,减少一次循环
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值为" + max);
    }
}
