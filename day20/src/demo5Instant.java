import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class demo5Instant {
    public static void main(String[] args) {
        //获取当前时间的instant对象
        Instant now = Instant.now();
        System.out.println(now);

        //根据(秒/毫秒/纳秒)获取instant对象
        Instant instant1 = Instant.ofEpochSecond(1L);
        Instant instant2 = Instant.ofEpochMilli(1000L);
        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);

        //指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(zonedDateTime);

        //判断
        Instant instant4 = Instant.ofEpochSecond(1L);
        Instant instant5 = Instant.ofEpochSecond(5L);

        boolean result1 = instant4.isAfter(instant5);
        System.out.println(result1);

        boolean result2 = instant4.isBefore(instant5);
        System.out.println(result2);

        //减少
        Instant instant6 = instant5.minusSeconds(1L);
        System.out.println(instant6);

        //增加
        Instant instant7 = instant6.plusMillis(2L);
        System.out.println(instant7);

        Instant plus = instant6.plus(1L, ChronoUnit.DAYS);
        System.out.println(plus);
    }
}
