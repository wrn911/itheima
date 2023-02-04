package convertStream;

import java.io.*;
import java.nio.charset.Charset;

public class demo3 {
    public static void main(String[] args) throws IOException {
        //将本地的GBK文件转成UTF-8文件
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("day29\\src\\convertStream\\gbkfile.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day29\\src\\c.txt"),"UTF-8");

        //边读边写
        int b;
        while ((b = isr.read()) != -1){
            osw.write(b);
        }

        osw.close();
        isr.close();*/

        FileReader fr = new FileReader("day29\\src\\convertStream\\gbkfile.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("day29\\src\\c.txt", Charset.forName("UTF-8"));
        int b;
        while ((b = fr.read()) != -1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
