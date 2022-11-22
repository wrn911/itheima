package Comprehensive;

import java.util.Random;

public class try1 {
    public static void main(String[] args) {
        char[] arr = new char[5];
        //定义字符a - z数组
        char[] arr1 = new char[52];
        for (int i = 0; i < arr1.length; i++) {
            if (i <= 25){
                arr1[i] = (char)(i + 'A');
            }else {
                arr1[i] = (char)(i + 'a' - 26);
            }
        }
        System.out.println(new String(arr1));
        //4次循环,生成前四个字母
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            arr[i] = arr1[index];
        }
        //生成最后一个数字
        int num = r.nextInt(9);
        arr[arr.length - 1] = (char)(num + '0');
        System.out.println(arr[arr.length - 1]);
        //最后一个数字与数组内任意元素换位
        int randomIndex = r.nextInt(5);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        //toString
        System.out.println(new String(arr));
    }
}
