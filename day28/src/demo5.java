import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //(小)文件拷贝
        //核心思想: 边读边写
        FileInputStream fis = new FileInputStream("C:\\Users\\86139\\Pictures\\Default.jpg");
        FileOutputStream fos = new FileOutputStream("day28\\Default.jpg");

        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }

        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);//4518
    }
}
