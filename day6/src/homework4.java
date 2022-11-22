public class homework4 {
    public static void main(String[] args) {
        double number = jueDuiZhi(-2.131);
        System.out.print("绝对值为:" + number);
    }
    public static double jueDuiZhi(double number){
        if (number > 0){
            return number;
        }else {
            return -number;
        }
    }
}
