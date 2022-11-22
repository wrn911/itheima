import java.awt.color.ICC_ColorSpace;

public class test3 {
    //不死神兔
    //有一对兔子,从出生后第三个月起每月生一对兔子,
    // 小兔子涨到第三个月后每个月又生一对兔子,假如兔子都不死,
    // 第十二个月有多少对兔子(斐波那契数列)
    public static void main(String[] args) {
        //解法一
        int[] arr = new int[12];

        arr[0] = 1;
        arr[1] = 1;

        //遍历,为下面的数据赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        //第十二个月的数据
        System.out.println(arr[11]);


        //解法二,递归
        //程序出口
        //递归规律
        //fn(12) = fn(11) + fn(10)
        //fn(11) = fn(10) + fn(9)
        //fn(10) = fn(9) + fn(8)
        //...
        //fn(3) = fn(2) + fn(1)
        //fn(2) = 1
        //fn(1) = 1
        System.out.println(getSum(12));
    }

    public static int getSum(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return getSum(number - 1) + getSum(number - 2);
        }
    }
}
