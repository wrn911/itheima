package dome1;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6,4,3};
        String arr = ArrayUtil.printArr(arr1);
        System.out.println(arr);

        double[] arr2 = {1.2,4.3,5.43,76.5};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);

        System.out.println("-----------------------------");
    }

}
