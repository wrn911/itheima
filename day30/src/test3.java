import cn.hutool.core.io.FileUtil;

import java.util.Collections;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        List<String> list = FileUtil.readLines("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\a.txt", "UTF-8");
        Collections.shuffle(list);
        System.out.println(list.get(0).substring(0,3));
    }
}
