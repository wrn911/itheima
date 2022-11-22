import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo3 {
    public static void main(String[] args) throws ParseException {
        //解析
        String time = "1111-11-11 11:11:11";
        //注意,创建对象的格式要和字符串的格式完全一致
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        System.out.println(date);
    }
}
