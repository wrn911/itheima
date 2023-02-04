import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class demo9 {
    public static void main(String[] args) {
        File[] files = File.listRoots();
        System.out.println(Arrays.toString(files));

        File f1 = new File("D:\\截图");
        String[] arr1 = f1.list();
        System.out.println(Arrays.toString(arr1));

        File f2 = new File("D:\\截图");
        String[] arr2 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                return file.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr2));

        File f3 = new File("D:\\截图");
        File[] arr3 = f3.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));

        File f4 = new File("D:\\截图");
        File[] arr4 = f4.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr4));
    }
}
