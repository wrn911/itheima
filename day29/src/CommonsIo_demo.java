import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;

public class CommonsIo_demo {
    public static void main(String[] args) throws IOException {
        /*File src = new File("D:\\aaa");
        File dest = new File("D:\\bbb");*/
        File src = new File("D:\\a.txt");
        File dest = new File("D:\\b.txt");

        //FiLeUtils包演示

        //复制文件
        //FileUtils.copyFile(src,dest);

        //复制文件夹
        //FileUtils.copyDirectory(src,dest);

        //复制文件夹
        //FileUtils.copyDirectoryToDirectory(src,dest);

        //删除文件夹
        //FileUtils.deleteDirectory(dest);

        //清空文件夹
        //FileUtils.cleanDirectory(dest);

        //读取文件中的数据变成字符串
        /*String s = FileUtils.readFileToString(src, "GBK");
        System.out.println(s)*/;

        //写出数据(不自动换行)
        //FileUtils.write(src,"123456789\r\n","UTF-8",true);

        //IOUtils包演示
        /*FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);*/

        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);

        //复制文件
        /*IOUtils.copy(fis,fos);
        fos.close();
        fis.close();*/

        //复制大文件
        /*long l = IOUtils.copyLarge(fr, fw);
        System.out.println(l);

        fw.close();
        fr.close();*/

        //读取数据
        //读取的结果是一个集合
        //System.out.println(IOUtils.readLines(fr));

        //写出数据
        //无续写开关
        IOUtils.write("wwwwwwwwwwwwwwwww",fw);

        fw.close();
        fr.close();
    }
}
