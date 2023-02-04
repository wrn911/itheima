package printStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建字节打印流对象
        PrintStream ps = new PrintStream(new FileOutputStream("day29\\src\\a.txt"),true, Charset.forName("UTF-8"));
        ps.print(1234);
        ps.println(1233);
        ps.printf("%sdsdfksfo","小");
        ps.close();
    }
}
