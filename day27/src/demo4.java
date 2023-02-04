import java.io.File;

public class demo4 {
    public static void main(String[] args) {
        //1
        String str = "C:\\Users\\86139\\Desktop\\新建 文本文档.txt";
        File f1 = new File(str);
        System.out.println(f1);

        //2
        //父级路径:"C:\Users\86139\Desktop"
        //子级路径:"新建 文本文档.txt"
        String parent = "C:\\Users\\86139\\Desktop";
        String child = "新建 文本文档.txt";
        File f2 = new File(parent,child);
        System.out.println(f2);

        //3
        File f3 = new File(parent);
        System.out.println(f3);
        File f4 = new File(f3,child);
        System.out.println(f4);
    }
}
