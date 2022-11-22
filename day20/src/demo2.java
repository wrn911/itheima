import java.text.SimpleDateFormat;
import java.util.Date;

public class demo2 {
    public static void main(String[] args) {
        //空参
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String format1 = sdf1.format(d1);
        System.out.println(format1);
        //带参数
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 EE");
        String format2 = sdf2.format(d1);
        System.out.println(format2);
    }
}
