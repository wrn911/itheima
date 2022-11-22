import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class test7 {
    public static void main(String[] args) throws ParseException {
        //代码计算我活了多少天

        //jdk7
        //规则:涉及时间的计算,须先把时间转成毫秒值
        //当前时间
        Date nowDate = new Date();
        //出生时间
        String str = "2004年2月23日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthDate = sdf.parse(str);
        //转成毫秒值
        long nowDateTime = nowDate.getTime();
        long birthDateTime = birthDate.getTime();
        //计算,转成天数
        long result1 = (nowDateTime - birthDateTime) / 1000 / 60 / 60 / 24;
        System.out.println(result1 + "天");

        //jdk8
        //当前时间
        LocalDate d1 = LocalDate.now();
        //出生时间
        LocalDate d2 = LocalDate.of(2004,2,23);
        long result2 = ChronoUnit.DAYS.between(d2, d1);
        System.out.println(result2 + "天");
    }
}
