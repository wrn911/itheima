import java.io.FileInputStream;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day28\\src\\a.txt");
        System.out.println((char) fis.read());
        System.out.println((char) fis.read());
        System.out.println((char) fis.read());
        System.out.println((char) fis.read());
        System.out.println((char) fis.read());
        System.out.println(fis.read());//-1
        fis.close();
    }
}
