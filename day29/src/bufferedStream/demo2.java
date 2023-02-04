package bufferedStream;

import java.io.*;

public class demo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day29\\src\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day29\\src\\copy.txt"));

        //拷贝
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        bos.close();
        bis.close();
    }
}
