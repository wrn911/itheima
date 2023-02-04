package bufferedStream;

import java.io.*;
import java.util.HashMap;
import java.util.List;

public class test2 {
    public static void main(String[] args) throws IOException {
        //读取数据
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\" +
                "黑马程序员\\3、Java入门到起飞（含斯坦福大学练习题+力扣算法题+大厂java面试题）\\入门到起飞（下）\\资料\\day29-IO（其他流）\\资料\\csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29\\src\\a.txt"));
        HashMap<Integer,String> hm = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null){
            hm.put(Integer.valueOf(line.split("\\.")[0]),line.split("\\.")[1]);
        }
        //排序
        List<Integer> list = hm.keySet().stream().sorted().toList();
        //写出
        for (Integer i : list) {
            bw.write(i + "." + hm.get(i));
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
