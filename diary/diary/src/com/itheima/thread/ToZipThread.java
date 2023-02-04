package com.itheima.thread;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ToZipThread extends Thread{

    File dest;

    public ToZipThread(File dest) {
        this.dest = dest;
    }

    @Override
    public void run() {
        synchronized (ToZipThread.class){
            try {
                toZip(dest);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //定义一个方法用于压缩
    private void toZip( File dest) throws IOException {
        //创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        BufferedReader br = new BufferedReader(new FileReader("diary\\diary\\data\\data.txt"));
        String line;
        //读取日记信息
        while ((line = br.readLine()) != null) {
            String[] arr = line.split("-");
            //拼接文件名
            String fileName = arr[0].substring(2) + "." + arr[1] + ".txt";
            //拷贝
            //创建zipentry对象
            ZipEntry ze = new ZipEntry(fileName);
            //把zipEntry放到压缩包中
            zos.putNextEntry(ze);
            //写入数据(正文)
            String str = arr[2];
            //底层细节:若用字节数组写出,则写出文件的编码为默认编码utf-8
            byte[] bytes = str.getBytes();
            zos.write(bytes);
            //关流,表示当前文件拷贝完毕
            zos.closeEntry();
        }
        //释放资源
        zos.close();
    }

}
