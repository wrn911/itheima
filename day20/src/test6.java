import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class test6 {
    public static void main(String[] args) {
        //判断闰年
        //jdk7
        //获取3月1日
        //日期向前减一天,判断该天是28还是29
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);

        //jdk8
        LocalDate ld = LocalDate.of(2000, 3, 1);
        LocalDate ld2 = ld.minus(1, ChronoUnit.DAYS);
        int day2 = ld2.getDayOfMonth();
        System.out.println(day2);

        //jik8新增判断闰年方法
        System.out.println(ld.isLeapYear());

    }
}
