package convertStream;

import java.io.*;
import java.nio.charset.Charset;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //按字符指定编码读取
        //JDK11之前(已被淘汰)
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("day29\\src\\convertStream\\gbkfile.txt"),"GBK");
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char) b);
        }
        isr.close();*/

        //JDK11之后
        FileReader fis = new FileReader("day29\\src\\convertStream\\gbkfile.txt", Charset.forName("GBK"));
        int b;
        while ((b = fis.read()) != -1){
            System.out.print((char)b);
        }
        fis.close();
    }
}
