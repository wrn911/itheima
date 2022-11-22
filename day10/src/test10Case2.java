import java.util.Scanner;

public class test10Case2 {
    //1-Ⅰ、2-Ⅱ、3-Ⅲ、4-Ⅳ、5-Ⅴ、6-Ⅵ、7-Ⅶ、8-Ⅷ、9-Ⅸ。
    //罗马数字转换
    public static void main(String[] args) {
        //键盘录入数字
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数字");
            str = sc.next();
            //判断是否符合条件
            boolean flag = checkStr(str);
            if (flag) {
                break;
            }
        }
        //转换为罗马数字
        System.out.println(toLuoMa(str));
    }
    //转换为罗马数字
    public static String toLuoMa(String str){
        //法二switch
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //遍历依次转换
            char c = str.charAt(i);
            String s =switch (c){
                case '1' -> "Ⅰ";
                case '2' -> "Ⅱ";
                case '3' -> "Ⅲ";
                case '4' -> "Ⅳ";
                case '5' -> "Ⅴ";
                case '6' -> "Ⅵ";
                case '7' -> "Ⅶ";
                case '8' -> s ="Ⅷ";//两种写法都行,但没必要
                case '9' -> "Ⅸ";
                default -> "";
            };
            sb.append(s);
        }
        return sb.toString();
    }

    //判断是否符合条件
    //1长度小于等于9
    //2只能是数字
    public static boolean checkStr(String str){
        if (str.length() > 9){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
