import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo7 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        //(大)文件拷贝
        FileInputStream fis = new FileInputStream("C:\\Users\\86139\\Pictures\\Default.jpg");
        FileOutputStream fos = new FileOutputStream("day28\\Default.jpg");

        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = fis.read(bytes)) != -1){
            //读多少写多少
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);//16
    }
}
