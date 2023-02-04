import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo10 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String str = "i你哟";
        byte[] bytes1 = str.getBytes();
        System.out.println(Arrays.toString(bytes1));

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));

        //解码
        System.out.println(new String(bytes1));
        System.out.println(new String(bytes1,"GBK"));
    }
}
