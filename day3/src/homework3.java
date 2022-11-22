public class homework3 {
    public static void main(String[] args) {
        int fish = 24;
        int huashen = 8;
        int rice = 3;
        int result1 = 16 + huashen + rice;

        //判断优惠
        int result3 = fish + huashen + rice;
        double result2 = (result3 > 30? result3 * 0.8 : result3);
        double result = (result2 > result1? result2 : result1);
        String result4 = (result2 > result1? "优惠" : "特价");
        System.out.println(result);
        System.out.println(result4);
    }
}
