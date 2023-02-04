package printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

public class demo2 {
    public static void main(String[] args) throws IOException {
        //创建字符打印流对象
        PrintWriter pw = new PrintWriter(new FileWriter("day29\\src\\a.txt"),true);
        pw.print(1234);
        pw.println(1233);
        pw.printf("%sdsdfksfo","小");
        pw.close();
    }
}
