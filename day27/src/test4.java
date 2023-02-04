import java.io.File;

public class test4 {
    public static void main(String[] args) {
        delete(new File("D:\\截图"));
    }

    public static void delete(File file){
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                f.delete();
            }else {
                delete(f);
            }
        }
        file.delete();
    }
}
