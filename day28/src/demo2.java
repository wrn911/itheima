import java.io.FileOutputStream;
import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        //打开续写开关(第二个参数传递true)
        FileOutputStream fos = new FileOutputStream("day28\\src\\a.txt",true);
        String str1 = "iosfjxckgheuirw;ddkwwad";
        byte[] bytes1 = str1.getBytes();
        fos.write(bytes1);

        //换行
        String str2 = "\r\n";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2);

        fos.write("sfhwfjxjf".getBytes());

        //换行
        String str3 = "\r\n";
        byte[] bytes3 = str3.getBytes();
        fos.write(bytes3);

        fos.close();
    }
}
