import java.util.Random;
import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        //输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //打乱字符串
        String result = dirty(str);
        System.out.println(result);
    }
    //打乱字符串
    public static String dirty(String str){
        //随机数
        Random r = new Random();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int randomIndex = r.nextInt(str.length() - 1);
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return new String(arr);
    }
}
