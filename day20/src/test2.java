import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test2 {
    public static void main(String[] args) throws ParseException {
        //指定时间转换
        String str = "2000-11-11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        //解析时间
        Date date = sdf1.parse(str);
        //格式化时间
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM" +
                "月dd日");
        String format = sdf2.format(date);
        System.out.println(format);
    }
}
