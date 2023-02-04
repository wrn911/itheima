import java.io.FileWriter;
import java.io.IOException;

public class demo13 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day28\\src\\a.txt");

        char[] chars = {'a','b','d','我'};
        String str = "小王加油加油";

        //fw.write(24351);
        //fw.write(str);
        //fw.write(str,0,2);
        //fw.write(chars);
        fw.write(chars,0,2);


        fw.close();
    }
}
