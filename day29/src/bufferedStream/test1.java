package bufferedStream;

import java.io.*;

public class test1 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //method1();
        //method2();//669
        //method3();
        method4();//727
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\山大\\大一上\\后端培训\\后端第二次培训(爬虫)录屏.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\山大\\大一上\\后端培训\\aaa.mp4");
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }

    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\山大\\大一上\\后端培训\\后端第二次培训(爬虫)录屏.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\山大\\大一上\\后端培训\\aaa.mp4");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }

    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\山大\\大一上\\后端培训\\后端第二次培训(爬虫)录屏.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\山大\\大一上\\后端培训\\aaa.mp4"));
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }

    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\山大\\大一上\\后端培训\\后端第二次培训(爬虫)录屏.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\山大\\大一上\\后端培训\\aaa.mp4"));
        byte[] bytes = new byte[8192];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
