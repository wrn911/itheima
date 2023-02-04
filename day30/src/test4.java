import cn.hutool.core.io.FileUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test4 {
    public static void main(String[] args) {
        //统计变量
        int boyCount = 0;
        int girlCount = 0;

        //假数据
        List<String> list1 = FileUtil.readLines("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\a.txt", "UTF-8");
        //定义新集合用于存放结果
        ArrayList<String> list = new ArrayList<>();
        for (String s : list1) {
            if (s.contains("男")){
                //男生,概率70%
                for (int i = 0; i < 7; i++) {
                    list.add(s);
                }
            }else {
                //女生,概率30%
                for (int i = 0; i < 3; i++) {
                    list.add(s);
                }
            }
        }

        for (int j = 0;j < 1000000;j++) {
            //随机
            Collections.shuffle(list);
            String info = list.get(0);
            //判断`并统计
            if (info.contains("男")){
                boyCount++;
            }else {
                girlCount++;
            }
        }
        System.out.println((double) boyCount / (double) girlCount);
    }
}
