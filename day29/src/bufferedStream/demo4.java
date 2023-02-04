package bufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29\\src\\b.txt",true));

        bw.write("1234567");
        bw.newLine();
        bw.write("1234567");
        bw.newLine();
        bw.write("1234567");
        bw.newLine();
        bw.close();
    }
}
