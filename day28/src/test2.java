import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test2 {
    //加密解密
    public static void main(String[] args) throws IOException {
        //原理:将数据异或(^)某个数两次后得到的还是他本身
        //创建对象关联原始文件
        FileInputStream fis = new FileInputStream("day28\\Default.jpg");
        //FileInputStream fis = new FileInputStream("day28\\ency.jpg");
        //创建对象关联加密\解密文件
        FileOutputStream fos = new FileOutputStream("day28\\ency.jpg");
        //FileOutputStream fos = new FileOutputStream("day28\\Default.jpg");
        //加密处理\解密处理
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b ^ 10);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
