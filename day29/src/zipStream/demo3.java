package zipStream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class demo3 {
    public static void main(String[] args) throws IOException {
        //需要压缩的文件夹
        File src = new File("D:\\截图");
        //压缩目的地
        File dest = new File(src.getParent(),src.getName() + ".zip");
        //创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //压缩文件
        toZip(src,zos, src.getName());
        //释放资源
        zos.close();
    }

    //压缩文件
    //参数一: 数据源
    //参数二: 与压缩包关联的压缩流
    //参数三: 压缩包内部的路径名
    private static void toZip(File src, ZipOutputStream zos,String pathName) throws IOException {
        //进入文件
        File[] files = src.listFiles();
        //获取每一个文件
        for (File file : files) {
            if (file.isFile()){
                //如果是文件,拷贝
                //创建zipentry对象
                //参数表示压缩包中的文件路径
                ZipEntry ze = new ZipEntry(pathName +"\\" + file.getName());
                //把zipEntry放到压缩包中
                zos.putNextEntry(ze);
                //拷贝
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else {
                //如果是文件夹,迭代
                toZip(file,zos,pathName +"\\" + file.getName());
            }
        }
    }
}
