import java.util.Calendar;
import java.util.Date;

public class demo10Calender {
    public static void main(String[] args) {
        //获取日历对象
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        Date time = instance.getTime();
        System.out.println(time);

        //获取日期对象
        time = instance.getTime();
        System.out.println(time);
        System.out.println(instance);


        //给日历设置日期对象
        Date d1 = new Date(1000L);
        instance.setTime(d1);
        System.out.println(instance);
        time = instance.getTime();
        System.out.println(time);
        //拿到时间毫秒值
        long timeInMillis = instance.getTimeInMillis();
        System.out.println(timeInMillis);
        time = instance.getTime();
        System.out.println(time);
        //修改日期中某个字段信息
        instance.set(Calendar.DATE, 20);
        System.out.println(instance);
        time = instance.getTime();
        System.out.println(time);
        //为某个字段添加\减少指定的值
        instance.add(Calendar.DAY_OF_MONTH, 9);
        System.out.println(instance);
        time = instance.getTime();
        System.out.println(time);
    }
}
