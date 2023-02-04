package bufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("day29\\src\\a.txt"));
        String line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);

        line = br.readLine();
        System.out.println(line);

        br.close();
    }
}
