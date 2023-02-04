package convertStream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class demo2 {
    public static void main(String[] args) throws IOException {
        //按字符指定编码写出
        //JDK11之前(已被淘汰)
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day29\\src\\c.txt"),"GBK");
        osw.write("新年快乐呀");
        osw.close();*/

        //JDK11之后
        FileWriter fw = new FileWriter("day29\\src\\c.txt", Charset.forName("GBK"));
        fw.write("新年快乐啊");
        fw.close();
    }
}
