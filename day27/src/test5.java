import java.io.File;

public class test5 {
    public static void main(String[] args) {
        //统计一个文件夹的总大小
        System.out.println(getLen(new File("D:\\新建文件夹")));
    }
    public static long getLen(File file){
        long len = 0;
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                len += f.length();
            }else {
                len += getLen(f);
            }
        }
        return len;
    }
}
