package bufferedStream;

import java.io.*;

public class test3 {
    public static void main(String[] args) throws IOException {
        //读取次数
        BufferedReader br = new BufferedReader(new FileReader("day29\\src\\count.txt"));
        String line = br.readLine();
        br.close();
        int count = Integer.parseInt(line);
        count++;
        //判断
        if (count <= 3) {
            System.out.println("this is " + count + ",,,yes,yes,yes!!!!!");
        } else {
            System.out.println("no,no.no!!!!");
        }
        //更新文件中的数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("day29\\src\\count.txt"));
        bw.write(count + "");
        bw.close();

    }
}
