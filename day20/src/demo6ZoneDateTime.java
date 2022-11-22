import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class demo6ZoneDateTime {
    public static void main(String[] args) {
        //当前时间
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //指定时间对象
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
                11, 12, 13, 1,
                zoneId);
        System.out.println(time1);

        //通过instant+时区的方式获取指定对象
        Instant instant = Instant.now();
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(time2);

        //修改
        ZonedDateTime time3 = time2.withYear(1000);
        System.out.println(time3);

        //减少
        ZonedDateTime time4 = time3.minusYears(9999);
        System.out.println(time4);

        //增加
        ZonedDateTime time5 = time4.plusYears(999);
        System.out.println(time5);
    }
}
