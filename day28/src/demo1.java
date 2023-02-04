
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day28\\src\\a.txt");
        //fos.write(97);

        byte[] bytes = {'a','b','c','d','e','f','g'};
        //fos.write(bytes);

        fos.write(bytes,0,3);
        //释放资源
        fos.close();
    }
}
