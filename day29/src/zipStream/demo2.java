package zipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class demo2 {
    public static void main(String[] args) throws IOException {
        //压缩单个文件
        //要压缩的文件
        File src = new File("D:\\a.txt");
        //压缩后的地址
        File dest = new File("D:\\");

        //调用方法进行压缩
        toZip(src,dest);
    }

    //调用方法进行压缩
    private static void toZip(File src, File dest) throws IOException {
        //创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"a.zip")));
        //创建zipEntry对象,表示压缩包里的每一个文件和文件夹
        ZipEntry ze = new ZipEntry("a.txt");
        //把zipEntry对象放到压缩包中
        zos.putNextEntry(ze);
        //把src文件中的数据写入到压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1){
            zos.write(b);
        }
        fis.close();
        zos.closeEntry();
        zos.close();
    }
}
