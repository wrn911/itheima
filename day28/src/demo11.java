import java.io.FileReader;
import java.io.IOException;

public class demo11 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day28\\src\\a.txt");
        int b;
        while ((b = fr.read()) != -1){
            System.out.print((char)b);
        }
        fr.close();
    }
}
