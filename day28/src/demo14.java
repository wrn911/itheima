import java.io.FileReader;
import java.io.IOException;

public class demo14 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day28\\src\\a.txt");
        fr.read();
        fr.read();
        fr.close();
    }
}
