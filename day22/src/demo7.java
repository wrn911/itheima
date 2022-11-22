public class demo7 {
    public static void main(String[] args) {
        //测试数组查询,删除,添加操作的时间
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        //查询
        long start1 = System.currentTimeMillis();
        System.out.println(arr[9999]);
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        //删除
        long start2 = System.currentTimeMillis();
        arr[99999] = 9;
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

    }
}
