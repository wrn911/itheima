import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test6 {
    public static void main(String[] args) {
        //剩下没点过的同学的名单
        File release = new File("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\b.txt");
        //已经点过的同学的名单
        File already = new File("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\c.txt");

        ArrayList<String> list2 = new ArrayList<>();

        //读取数据
        List<String> list1 = FileUtil.readUtf8Lines(release);

        //随机点名
        Collections.shuffle(list1);
        String name = list1.get(0);
        System.out.println(name);
        list1.remove(name);
        list2.add(name);
        //重新存储数据
        FileUtil.writeUtf8Lines(list1,release);
        FileUtil.appendUtf8Lines(list2,already);

        //判断是否已经读完
        if (list1.size() == 0){
            inite(release,already);
        }
    }

    private static void inite(File release, File already) {
        List<String> list = FileUtil.readUtf8Lines(already);
        FileUtil.writeUtf8Lines(list,release);
        FileUtil.writeUtf8Lines(new ArrayList<>(),already);
    }
}
