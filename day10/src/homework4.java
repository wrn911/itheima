import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        /*请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
        比如：Hello12345World中字母：10个，数字：5个。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //转换为小写
        String temp = str.toLowerCase();
        //System.out.println(temp);
        
        //变成字符数组
        char[] chars = temp.toCharArray();

        //统计变量
        int numberCount = 0;
        int letterCount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57){
                numberCount++;
            } else if (chars[i] >= 97 && chars[i] <= 122) {
                letterCount++;
            }
        }
        System.out.println(str + "中字母：" + letterCount + "个，数字：" + numberCount + "个。");
    }
}
