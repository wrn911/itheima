package Recursion;

public class test2 {
    public static void main(String[] args) {
        //利用递归求阶乘
        System.out.println(getFactorialRecursion(5));
    }
    public static int getFactorialRecursion(int number){
        if (number == 1){
            return 1;
        }
        return number*getFactorialRecursion(number - 1);
    }
}
