import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class test3 {
    public static void main(String[] args) throws IOException {
        //将文件中的数据排序并修改2-1-9-4-7-8
        //1.读取数据
        FileReader fr = new FileReader("day28\\src\\a.txt");
        StringBuilder sb = new StringBuilder();
        int b;
        while ((b = fr.read()) != -1){
            sb.append((char)b);
        }
        fr.close();
        //2.排序
        String[] arr = sb.toString().split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arr) {
            int i = Integer.parseInt(s);
            list.add(i);
        }
        Collections.sort(list);
        //3.写入数据
        FileWriter fw = new FileWriter("day28\\src\\a.txt");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1){
                 fw.write(list.get(i) + "");
            }else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();
    }
}
