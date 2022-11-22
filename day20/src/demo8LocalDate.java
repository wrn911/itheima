import java.time.LocalDate;

public class demo8LocalDate {
    public static void main(String[] args) {
        //获取当前时间对象
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //获取指定时间的日历对象
        LocalDate of = LocalDate.of(2023, 1, 1);
        System.out.println(of);

        //年
        int year = now.getYear();
        System.out.println(year);

        //月
        int monthValue = now.getMonthValue();
        System.out.println(monthValue);
        //日
        int dayOfMonth = now.getDayOfMonth();
        System.out.println(dayOfMonth);

        //判断
        System.out.println(now.isAfter(of));

        //修改
        LocalDate localDate = now.withYear(2023);
        System.out.println(localDate);

        //减少
        LocalDate localDate1 = localDate.minusYears(1);
        System.out.println(localDate1);
        //增加
        LocalDate localDate2 = localDate1.plusYears(1);
        System.out.println(localDate2);
    }
}
