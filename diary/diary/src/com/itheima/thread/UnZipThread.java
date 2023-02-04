package com.itheima.thread;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipThread extends Thread{

    File src;
    File dest;

    public UnZipThread(File src, File dest) {
        this.src = src;
        this.dest = dest;
    }

    @Override
    public void run() {
        synchronized (UnZipThread.class){
            try {
                unZip(src,dest);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //定义一个方法用于解压
    private void unZip(File src, File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry ze;
        //获取对应编号
        BufferedReader br = new BufferedReader(new FileReader("diary\\diary\\data\\count.txt"));
        String line = br.readLine();
        br.close();
        int count = Integer.parseInt(line);
        while ((ze = zis.getNextEntry()) != null) {
            //新元素的编号
            count++;
            //读取数据,并解码成字符串
            byte[] bytes = zis.readAllBytes();
            String str = new String(bytes);
            //获取文件名标题
            String title = ze.toString().split("\\.")[1];
            //写入数据
            BufferedWriter bw = new BufferedWriter(new FileWriter("diary\\diary\\data\\data.txt", true));
            bw.write("编号" + count + "-" + title + "-" + str);
            bw.newLine();
            bw.close();
            zis.closeEntry();
        }
        zis.close();
        //更新文件中的编号
        PrintWriter pw = new PrintWriter(new FileWriter("diary\\diary\\data\\count.txt"));
        pw.println(count);
        pw.close();
    }
}
