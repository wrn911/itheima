package zipStream;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class demo1 {
    //解压
    public static void main(String[] args) throws IOException {
        //压缩包
        File src = new File("D:\\截图.zip");
        //解压后的地址
        File dest = new File("D:\\");

        //定义一个方法用于解压
        unZip(src,dest);
    }
    //定义一个方法用于解压
    private static void unZip(File src, File dest) throws IOException {
        //解压的本质: 把压缩包里面的每一个文件或文件夹读取出来,按照层级拷贝到目的地当中
        //创建一个解压缩流用来读取压缩包中的数据
        //注意: windows环境下，默认字符集为GBK，ZipFile默认使用UTF-8字符集，当文件名存在中文时，ZipInputStream读取文件流就会失败。
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src), Charset.forName("GBK"));
        ZipEntry ze;
        while ((ze = zis.getNextEntry()) != null){
            if (ze.isDirectory()){
                //文件夹: 需要在目的地dest处创建一个同样的文件夹
                File file = new File(dest,ze.toString());
                file.mkdirs();
            }else {
                //文件: 需要读取到压缩包中的文件,并把它存放到目的地dest文件夹中(按照层级目录进行存放)
                FileOutputStream fos = new FileOutputStream(new File(dest,ze.toString()));
                int b;
                while ((b = zis.read()) != -1){
                    //写到目的地
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中的一个对象处理完了
                zis.closeEntry();
            }
        }
        zis.close();
    }
}
