import java.io.FileReader;
import java.io.IOException;

public class demo12 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day28\\src\\a.txt");
        char[] arr = new char[2];
        int len;
        while ((len = fr.read(arr)) != -1){
            System.out.print(new String(arr,0,len));
        }
        fr.close();
    }
}
