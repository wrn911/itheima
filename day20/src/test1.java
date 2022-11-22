import java.util.Date;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        //打印时间原点一年后的时间
        Date d = new Date(0L);
        long time = d.getTime();
        time += 1000L * 60 * 60 * 24 * 365;
        d.setTime(time);

        System.out.println(d);

        //定义两个时间对象,比较早晚
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        //获取时间
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        System.out.println(d1);
        System.out.println(d2);
        if (time1 > time2){
            System.out.println("第一个时间在后,第二个时间在前");
        } else if (time1 < time2) {
            System.out.println("第二个时间在后,第一个时间在前");
        }else {
            System.out.println("两时间相同");
        }
    }
}
