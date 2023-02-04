import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test1 {
    public static void main(String[] args) throws IOException {
        //定义变量记录网址
        String familyNameNet = "https://hanyu.baidu.com/shici/detail?pid=0b2f26d4c0ddb3ee693fdb1137ee1b0d&from=kg1";
        String boyNameNet = "http://www.haoming8.cn/baobao/10881.html";
        String girlNameNet = "http://www.haoming8.cn/baobao/7643.html";

        //爬取数据,将结果拼接成一个字符串返回
        String familyNameStr = webCrawler(familyNameNet);
        String boyNameStr = webCrawler(boyNameNet);
        String girlNameStr = webCrawler(girlNameNet);

        //使用正则表达式获取符合要求的数据
        ArrayList<String> familyNameTempList = getData(familyNameStr,"(.{4})(，|。)",1);
        ArrayList<String> boyNameTempList = getData(boyNameStr,"([\\u4E00-\\u9FA5]{2})(、|。)",1);
        ArrayList<String> girlNameTempList = getData(girlNameStr,"(.. ){4}..",0);

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
        BufferedWriter bw = new BufferedWriter(new FileWriter("day30\\src\\a.txt"));
        for (String s : infoList) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();


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

    //使用正则表达式获取符合要求的数据
    //参数一:数据源
    //参数二:正则表达式
    //参数三:获取正则表达式中的第几组数据
    private static ArrayList<String> getData(String str, String regex,int index) {
        ArrayList<String> list = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while (m.find()){
            list.add(m.group(index));
        }
        return list;
    }

    private static String webCrawler(String familyNameNet) throws IOException {
        //用于拼接结果
        StringBuilder sb = new StringBuilder();
        //定义一个URL对象
        URL url = new URL(familyNameNet);
        //连接网页
        URLConnection urlConnection = url.openConnection();
        //获取数据
        //使用转换流,方便处理字符
        InputStreamReader isr = new InputStreamReader(urlConnection.getInputStream());
        int b;
        while ((b = isr.read()) != -1){
            sb.append((char) b);
        }
        //释放资源
        isr.close();
        return sb.toString();
    }
}
