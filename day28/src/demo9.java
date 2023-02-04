import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo9 {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * JDK9: IO流中捕获异常的写法
         */
        //(大)文件拷贝
        //可以自动释放资源
        FileInputStream fis = new FileInputStream("C:\\Users\\86139\\Pictures\\Default.jpg");
        FileOutputStream fos = new FileOutputStream("day28\\Default.jpg");
        try (fis; fos) {
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1) {
                //读多少写多少
                fos.write(bytes, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
