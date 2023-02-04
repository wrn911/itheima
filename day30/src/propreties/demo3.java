package propreties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class demo3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day30\\src\\propreties\\a.properties");
        Properties prop = new Properties();
        prop.load(fr);
        System.out.println(prop);
    }
}
