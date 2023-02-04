import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class demo15 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day28\\src\\a.txt");
        for (int i = 0; i < 2; i++) {
            fw.write(97);
        }
        fw.flush();
        fw.write(98);
        fw.write(99);
        fw.write(99);
    }
}
