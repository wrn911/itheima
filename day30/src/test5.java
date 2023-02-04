import cn.hutool.core.io.FileUtil;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class test5 {
    public static void main(String[] args) throws IOException {
        List<String> list = FileUtil.readLines("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\a.txt", "UTF-8");

        //获取统计的次数
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\count.txt"));
        String str = br.readLine();
        int count = Integer.parseInt(str);
        count++;
        br.close();

        if (count!=3){
            Collections.shuffle(list);
            System.out.println(list.get(0).substring(0,3));
        }else {
            System.out.println("张三");
        }

        //统计的次数加一
        PrintStream ps = new PrintStream("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\count.txt");
        ps.println(count);
        ps.close();
    }
}
