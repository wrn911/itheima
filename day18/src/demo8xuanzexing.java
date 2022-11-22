import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo8xuanzexing {
    public static void main(String[] args) {

        String s = "java自从95年问世依赖.......Java11和JAva8,......." +
                "..阿巴阿巴阿布.....JAVa17.....相信.....JAVA17";

        //需求1
        //?理解为前面的数据Java
        //=表示Java后面要跟随的数据
        //但是在获取的时候,只获取前半部分
        String regex1 = "((?i)Java)(?=8|11|17)";
        //需求2
        //?理解为前面的数据Java
        //:表示Java后面要跟随的数据
        //在获取的时候,获取整体
        String regex2 = "((?i)Java)(?:8|11|17)";
        //需求3
        //?理解为前面的数据Java
        //!表示Java后面要去除的数据
        String regex3 = "((?i)Java)(?!8|11|17)";

        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(s);
        while(m1.find()){
            System.out.println(m1.group());
        }
        System.out.println("=============================================");
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(s);
        while(m2.find()){
            System.out.println(m2.group());
        }
        System.out.println("=============================================");
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(s);
        while(m3.find()){
            System.out.println(m3.group());
        }
    }
}
