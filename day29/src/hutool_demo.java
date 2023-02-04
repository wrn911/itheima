import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class hutool_demo {
    public static void main(String[] args) {
        //创建file对象
        File file = FileUtil.file("D:\\", "aa", "b", "b.txt");
        //根据参数创建文件
        File touch = FileUtil.touch(file);
        System.out.println(touch);
        //把集合中的数据写出到文件中,覆盖模式
        /*ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        list.add("aaa");
        FileUtil.writeLines(list,file,"UTF-8");*/
        //把集合中的数据写出到文件中,续写模式
        //FileUtil.appendLines(list,file, Charset.forName("UTF-8"));
        //指定字符编码,把文件中的数据读到集合中
        List<String> l = FileUtil.readLines(file, "UTF-8");
        System.out.println(l);
        //按照UTF-8字符编码,把文件中的数据读到集合中
        List<String> l1 = FileUtil.readUtf8Lines(file);
        System.out.println(l1);
        //拷贝
        //isOverride: 如果文件存在是否覆盖
        FileUtil.copy(file,new File("D:\\aa\\b\\c.txt"),false);
    }
}
