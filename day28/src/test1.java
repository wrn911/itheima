import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class test1 {
    //拷贝文件夹
    public static void main(String[] args) throws IOException {
        //要拷贝的文件
        File src = new File("D:\\截图");
        //拷贝后的文件
        File copy = new File("C:\\Users\\86139\\Desktop\\截图");

        copy(src,copy);
    }

    private static void copy(File src, File copy) throws IOException {
        copy.mkdirs();
        //进入要拷贝的文件
        File[] files = src.listFiles();
        //遍历,得到每一个文件
        for (File file : files) {
            if (file.isFile()){
                //判断,如果是文件,拷贝
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(copy,file.getName()));
                int len;
                byte[] arr = new byte[1024 * 1024];
                while ((len = fis.read(arr)) != -1){
                    fos.write(arr,0,len);
                }
                fos.close();
                fis.close();
            }else {
                //如果是文件夹,递归
                copy(file,new File(copy,file.getName()));
            }
        }
    }
}
