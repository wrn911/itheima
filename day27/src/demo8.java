import java.io.File;

public class demo8 {
    public static void main(String[] args) {
        File f = new File("D:\\山大\\大一上\\高程\\实验");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
