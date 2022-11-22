import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test3 {
    public static void main(String[] args) throws ParseException {
        //秒杀活动
        //秒杀开始时间:2023年11月11日 0:0:0
        //秒杀结束时间:2023年11月11日 0:10:0
        //小贾下单时间:2023年11月11日 0:1:0
        //小皮下单时间:2023年11月11日 0:11:0

        extracted("2023年11月11日 0:1:0","小贾");
        extracted("2023年11月11日 0:11:0","小皮");
    }

    private static void extracted(String time,String name) throws ParseException {
        //字符串
        String startStr = "2023年11月11日 0:0:0";
        String endStr = "2023年11月11日 0:10:0";
        String orderStr = time;

        //创建SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        //创建Date对象
        Date startDate = sdf.parse(startStr);
        Date endDate = sdf.parse(endStr);
        Date orderDate = sdf.parse(orderStr);

        //获得时间的毫秒值
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long orderTime = orderDate.getTime();

        //进行判断
        if (orderTime >= startTime && orderTime<= endTime){
            System.out.println(name+"秒杀成功");
        }else {
            System.out.println(name+"秒杀失败");
        }
    }
}
