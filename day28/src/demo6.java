import java.io.FileInputStream;
import java.io.IOException;

public class demo6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28\\src\\a.txt");

        //读取多个数据
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes,0,len));
        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes,0,len));
        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes,0,len));


        fis.close();
    }
}
