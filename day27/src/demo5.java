import java.io.File;

public class demo5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\Java\\IdeaProjects\\itheima\\README.md");
        File f2 = new File("D:\\Java\\IdeaProjects\\itheima\\package1");
        File f3 = new File("D:\\Java\\IdeaProjects\\itheima\\REA.md");
        //文件
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println("------------------------------------------");

        //文件夹
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());
        System.out.println("------------------------------------------");

        //不存在的文件
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
        System.out.println("------------------------------------------");

    }
}
