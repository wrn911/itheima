public class homework1 {
    public static void main(String[] args) {
        int price = 7988;
        int oldPrice = 1500;
        System.out.println(price * 0.8 );
        System.out.println(price - oldPrice);
        double a = price * 0.8;
        double b = price - oldPrice;
        if (a < b) {
            System.out.println("要");
        }else{
            System.out.println("不要");
        }
    }
}
