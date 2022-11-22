public class test9 {
    public static void main(String[] args) {
        //定义二维数组存放每个季度的营业额
        int[][] yearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        //全年营业额
        int yearSum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int sum = getSum(yearArrArr[i]);
            System.out.println("第" +(i+ 1) + "季度的营业额为" + sum);
            yearSum += sum;
        }
        System.out.println("全年的营业额为" + yearSum);
    }
    //计算每个极度的营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
