public class test4 {
    //猴子吃桃
    //有一堆桃子,猴子第一天吃了其中的一半,并多吃了一个,
    // 以后每天猴子都吃当前剩下的一半,让后再多吃一个,
    // 第10天的时候(还没吃),发现只剩下一个桃子了,请问,最初总共有几个桃子
    public static void main(String[] args) {
        System.out.println(getSum(1));
    }
    public static int getSum(int day){
        if (day == 10){
            //递归出口
            return 1;
        }else {
            return (getSum(day + 1) + 1) *2;
        }
    }
}
