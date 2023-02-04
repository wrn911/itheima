import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class demo6 {
    public static void main(String[] args) {
        //文件大小(不能返回文件夹的大小)
        File f1 = new File("D:\\Java\\IdeaProjects\\itheima\\README.md");
        System.out.println(f1.length());//11
        File f2 = new File("D:\\Java\\IdeaProjects\\itheima\\package1");
        System.out.println(f2.length());//0
        System.out.println("---------------------------------");

        //返回文件绝对路径
        File f3 = new File("itheima\\README.md");
        System.out.println(f3.getAbsolutePath());
        System.out.println("---------------------------------");

        //返回文件定义时的路径
        File f4 = new File("itheima\\README.md");
        System.out.println(f4.getPath());
        System.out.println("---------------------------------");

        //返回文件名称,带后缀
        File f5 = new File("itheima\\README.md");
        System.out.println(f5.getName());
        File f6 = new File("D:\\Java\\IdeaProjects\\itheima\\package1");
        System.out.println(f6.getName());
        System.out.println("---------------------------------");

        //返回文件最后修改时间(时间毫秒值)
        File f7 = new File("D:\\Java\\IdeaProjects\\itheima\\package1");
        long time = f7.lastModified();
        Date d = new Date(time);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日 HH: mm: ss");
        String format = simpleDateFormat.format(d);
        System.out.println(format);
    }
}
