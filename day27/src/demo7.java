import java.io.File;
import java.io.IOException;

public class demo7 {
    public static void main(String[] args) throws IOException {
        File f0 = new File("D:\\截图");
        boolean b0 = f0.mkdirs();
        System.out.println(b0);

        File f1 = new File("D:\\截图\\B.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);

        /*File f2 = new File("D:\\a\\截图\\a.txt");
        boolean b2 = f2.createNewFile();
        System.out.println(b2);*/

        File f3 = new File("D:\\截图\\a");
        boolean b3 = f3.createNewFile();
        System.out.println(b3);

        File f4 = new File("D:\\截图\\aaa\\bbb");
        boolean b4 = f4.mkdir();
        System.out.println(b4);

        File f5 = new File("D:\\截图\\aaa\\bbb");
        boolean b5 = f5.mkdirs();
        System.out.println(b5);

        /*File f6 = new File("D:\\截图\\a.txt");
        boolean b6 = f6.delete();
        System.out.println(b6);*/
    }
}
