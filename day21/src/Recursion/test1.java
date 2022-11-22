package Recursion;

public class test1 {
    public static void main(String[] args) {
        //用递归求1~100的和

        //大问题拆解成小问题
        //1~100之间的和 = 100 + (1~99之间的和)
        //1~99之间的和 = 100 + (1~98之间的和)
        //...
        //1~1之间的和 = 1(出口)
        System.out.println(getSum(100));
    }
    public static int getSum(int number){
        if (number == 1){
            return 1;
        }

        return number + getSum(number - 1);
    }
}
