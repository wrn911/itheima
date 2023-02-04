import java.io.File;

public class test2 {
    public static void main(String[] args) {
        //找某一个文件夹里是否有以md结尾的文件
        File f = new File("D:\\Java\\IdeaProjects\\itheima");
        System.out.println(haveMD(f));
    }

    public static boolean haveMD(File file){
        //进入文件夹,获取所有文件
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".md")){
                System.out.println(f);
                return true;
            }
        }
        return false;
    }
}
