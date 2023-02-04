package convertStream;

import java.io.*;

public class demo4 {
    public static void main(String[] args) throws IOException {
        //使用转换流实现字节流逐行读取
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("day29\\src\\c.txt")));
        String b;
        while ((b = br.readLine()) != null){
            System.out.println(b);
        }
        br.close();
    }
}
