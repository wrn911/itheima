import java.io.FileInputStream;
import java.io.IOException;

public class demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28\\src\\a.txt");
        //循环读取
        int b;
        while ((b = fis.read()) != -1){
            System.out.print((char)b);
        }
        fis.close();
    }
}
