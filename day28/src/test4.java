import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test4 {
    public static void main(String[] args) throws IOException {
        //将文件中的数据排序并修改2-1-9-4-7-8
        //1.读取数据
        FileReader fr = new FileReader("day28\\src\\a.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fr.read()) != -1) {
            sb.append((char) b);
        }
        fr.close();
        //2.排序
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        String s = Arrays.toString(arr);
        //3.写入数据
        FileWriter fw = new FileWriter("day28\\src\\a.txt");
        String str = Arrays.toString(arr).replace(", ", "-");
        fw.write(str.substring(1, str.length() - 1));
        fw.close();
    }
}
