import java.io.File;

public class test3 {
    public static void main(String[] args) {
        //找某一个文件夹里是否有以avi结尾的文件
        haveAVI();
    }

    public static void haveAVI(){
        File[] files = File.listRoots();
        for (File file : files) {
            haveAVI(file);
        }
    }

    public static void haveAVI(File file){
        //进入文件夹,获取所有文件
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".avi")){
                System.out.println(f);
            } else if (f.isDirectory()) {
                haveAVI(f);
            }
        }
    }
}
