import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class demo9ChronoUnit {
    public static void main(String[] args) {
        //当前时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //本世纪初
        LocalDateTime of = LocalDateTime.of(2000, 1, 1,
                0, 0, 0);
        System.out.println(of);

        System.out.println("相差的年数:" + ChronoUnit.YEARS.between(of,now));//第二项减第一项
        System.out.println("相差的月数:" + ChronoUnit.MONTHS.between(of,now));//第二项减第一项
        System.out.println("相差的周数:" + ChronoUnit.WEEKS.between(of,now));//第二项减第一项
        System.out.println("相差的日数:" + ChronoUnit.DAYS.between(of,now));//第二项减第一项
        System.out.println("相差的时数:" + ChronoUnit.HOURS.between(of,now));//第二项减第一项
        System.out.println("相差的分数:" + ChronoUnit.MINUTES.between(of,now));//第二项减第一项
        System.out.println("相差的秒数:" + ChronoUnit.SECONDS.between(of,now));//第二项减第一项
        System.out.println("相差的半天数:" + ChronoUnit.HALF_DAYS.between(of,now));//第二项减第一项
        System.out.println("相差的十年数:" + ChronoUnit.DECADES.between(of,now));//第二项减第一项
        System.out.println("相差的千年数:" + ChronoUnit.MILLENNIA.between(of,now));//第二项减第一项
        System.out.println("相差的世纪(百年)数:" + ChronoUnit.CENTURIES.between(of,now));//第二项减第一项
        System.out.println("相差的纪元数:" + ChronoUnit.ERAS.between(of,now));//第二项减第一项
    }
}
