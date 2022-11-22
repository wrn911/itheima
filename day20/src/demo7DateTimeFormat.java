import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class demo7DateTimeFormat {
    public static void main(String[] args) {
        //获取时间对象
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        //解析/格式化器
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:dd EE a");
        //格式化
        String format = dateTimeFormatter.format(zonedDateTime);
        System.out.println(format);
    }
}
