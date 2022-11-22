import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();
        //统计
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z'){
                //char类型的变量在参与计算是自动提升为int,查询ascii码表
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }

        System.out.println("大写字母共有" + bigCount + "个");
        System.out.println("小写字母共有" + smallCount + "个");
        System.out.println("数字共有" + numberCount + "个");
    }
}

