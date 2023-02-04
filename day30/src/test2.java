import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.io.BufferedWriter;
import java.util.*;

public class test2 {
    //使用糊涂包生成假数据
    public static void main(String[] args) {
        //定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg1";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7643.html";

        //爬取数据,将结果拼接成一个字符串返回
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //使用正则表达式获取符合要求的数据
        List<String> familyNameTempList = ReUtil.findAll("(.{4})(，|。)", familyNameStr, 1);
        List<String> boyNameTempList = ReUtil.findAll("([\\u4E00-\\u9FA5]{2})(、|。)", boyNameStr, 1);
        List<String> girlNameTempList = ReUtil.findAll("(.. ){4}..", girlNameStr, 0);

        //处理数据
        //处理姓氏
        ArrayList<String> familyNameList = new ArrayList<>();
        for (String str : familyNameTempList) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                familyNameList.add(c + "");
            }
        }

        //处理男生名字(去重)
        ArrayList<String> boyNameList = new ArrayList<>();
        for (String s : boyNameTempList) {
            if (!boyNameList.contains(s)){
                boyNameList.add(s);
            }
        }


        //处理女生名字
        ArrayList<String> girlNameList = new ArrayList<>();
        for (String str : girlNameTempList) {
            String[] s = str.split(" ");
            Collections.addAll(girlNameList, s);
        }

        //拼接个人信息
        ArrayList<String> infoList = getInfos(familyNameList,boyNameList,girlNameList,70,70);
        Collections.shuffle(infoList);

        //写入本地文件中
        //细节:糊涂包的相对路径是相对于class文件而言
        FileUtil.writeLines(infoList,"D:\\Java\\IdeaProjects\\itheima\\day30\\src\\a.txt","UTF-8");

    }

    //拼接个人信息
    private static ArrayList<String> getInfos(ArrayList<String> familyNameList, ArrayList<String> boyNameList, ArrayList<String> girlNameList, int boyCount, int girlCount) {
        //获取不重复的男生的名字
        HashSet<String> boyHs = new HashSet<>();
        while (boyHs.size() != boyCount){
            //随机姓名
            Collections.shuffle(familyNameList);
            Collections.shuffle(boyNameList);
            boyHs.add(familyNameList.get(0) + boyNameList.get(0));
        }

        //获取不重复的女生的名字
        HashSet<String> girlHs = new HashSet<>();
        while (girlHs.size() != girlCount){
            //随机姓名
            Collections.shuffle(familyNameList);
            Collections.shuffle(girlNameList);
            girlHs.add(familyNameList.get(0) + girlNameList.get(0));
        }

        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        //拼接男生信息
        for (String boy : boyHs) {
            list.add(boy + "-男-" + (r.nextInt(10) + 18));
        }
        //拼接女生信息
        for (String girl : girlHs) {
            list.add(girl + "-女-" + (r.nextInt(10) + 18));
        }


        return list;
    }
}
