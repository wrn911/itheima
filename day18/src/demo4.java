import java.math.BigDecimal;

public class demo4 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.9");
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = BigDecimal.valueOf(10);
        BigDecimal bd5 = BigDecimal.valueOf(10);
        System.out.println(bd4 == bd5);

        BigDecimal bd6 = new BigDecimal(0.1);
        BigDecimal bd7 = new BigDecimal(0.9);
        BigDecimal bd8 = bd6.add(bd7);
        System.out.println(bd8);
        System.out.println(bd6);
    }
}
