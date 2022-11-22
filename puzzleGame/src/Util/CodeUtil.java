package Util;

import java.util.Random;

public class CodeUtil {
    public static String getCode(){
        Random r = new Random();
        //创建数组,存储生成的验证码
        char[] arr = new char[5];
        //创建数组,存储字母
        char[] chs = new char[52];
        //放入字母
        for (int i = 0; i < chs.length; i++) {
            if (i < 26){
                chs[i] = (char)(i + 65);
            }else {
                chs[i] = (char)(i - 26 + 97);
            }
        }
        /*//遍历数组
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }*/

        //像验证码数组中加入字母
        for (int i = 0; i < 4; i++) {
            arr[i] = chs[r.nextInt(52)];
        }

        //像验证码数组中加入数字
        arr[4] = (char) (r.nextInt(9) + '0');

        //数字与字母交换
        int randomIndex = r.nextInt(4);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[4];
        arr[4] = temp;

        return new String(arr);
    }

 /*   public static void main(String[] args) {
        String s = getCode();
        System.out.println(s);
    }*/


}
