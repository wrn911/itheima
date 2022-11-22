import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo9tanlan {
    public static void main(String[] args) {
        String s = "java自从95年问世依赖...." +
                "abbbbbbbbbbbbbbbbbbbbbbaaaaaaaaaaaaaaaaaaa...Java11和JAva8,......." +
                "..阿巴阿巴阿布.....JAVa17.....相信.....JAVA17";

        String regex1 = "ab+";
        String regex2 = "ab+?";

        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(s);
        while (m1.find()){
            System.out.println(m1.group());
        }
        System.out.println("------------------------------------------------");
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(s);
        while (m2.find()){
            System.out.println(m2.group());
        }
    }
}
