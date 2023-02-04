package bufferedStream;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day29\\src\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day29\\src\\copy.txt"));
        //拷贝
        int b;
        while ((b = bis.read())!= -1){
            bos.write(b);
        }
        bos.close();
        bis.close();
    }
}
