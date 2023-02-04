package com.itheima.util;

import java.util.ArrayList;
import java.util.Random;

public class CodeUtil {

    /*public static String getCode(){
        //验证码要求：
        //   包含大小写A-Z和数字0-9
        //   字母4个，数字1个
        //   字母和数字的位置是随机的。
        Random r = new Random();
        char[] arr = new char[52];
        char[] code = new char[5];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26){
                arr[i] = (char)('a' + i);
            }else {
                arr[i] = (char)('A' + i - 26);
            }
        }

        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr.length);
            code[i] = arr[index];
        }

        code[4] = (char)('0'+r.nextInt(10));

        int index = r.nextInt(5);

        char temp = code[4];
        code[4] = code[index];
        code[index] = temp;

        return new String(code);
    }*/
    //完成上面的要求之后，自己思考，如果换一个验证码的需求是否可以完成呢？
    //   比如1：包含大小写A-Z和数字0-9，总长度为5，内容随机的，生成的结果不包含大小写字母o
   /* public static String getCode(){
        //验证码要求：
        //   包含大小写A-Z和数字0-9
        //   字母4个，数字1个
        //   字母和数字的位置是随机的。
        Random r = new Random();
        char[] arr = new char[60];
        char[] code = new char[5];
        //数组索引
        int i = 0;
        //表示数组中已存入数据的个数
        int count = 0;
        while(count != 52){
            char c;
            if (i < 25){
                c  = (char)('a' + count);
                count++;
                if (c == 'o') {
                    continue;
                }
            }else {
                c = (char)('A' + count - 26);
                count++;
                if (c == 'O') {
                    continue;
                }
            }
            arr[i] = c;
            i++;
        }

        for (int i1 = 0; i1 < 10; i1++) {
            arr[i1 + 50] = (char)(i1 + '0');
        }

        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1] + " ");
        }
        System.out.println();

        for (int i1 = 0; i1 < 5; i1++) {
            int index = r.nextInt(arr.length);
            code[i1] = arr[index];
        }

        return new String(code);
    }*/
    //   比如2：包含大小写A-Z和数字0-9，总共长度为4或5，内容都是随机的，但是数字不能连续
    public static String getCode(){
        //验证码要求：
        //   包含大小写A-Z和数字0-9
        //   字母4个，数字1个
        //   字母和数字的位置是随机的。
        Random r = new Random();
        char[] arr = new char[60];
        char[] code = new char[r.nextInt(2) + 4];
        //数组索引
        int i = 0;
        //表示数组中已存入数据的个数
        int count = 0;
        while(count != 52){
            char c;
            if (i < 25){
                c  = (char)('a' + count);
                count++;
                if (c == 'o') {
                    continue;
                }
            }else {
                c = (char)('A' + count - 26);
                count++;
                if (c == 'O') {
                    continue;
                }
            }
            arr[i] = c;
            i++;
        }

        for (int i1 = 0; i1 < 10; i1++) {
            arr[i1 + 50] = (char)(i1 + '0');
        }

        //确保数字不能连续
        int pre = 0;
        for (int i1 = 0; i1 < code.length; i1++) {
            //随机获取一个索引
            int index = r.nextInt(arr.length);
            //如果前一个和这一个都是数字就再次获取索引
            while ((pre > 49) && (index > 49)) {
                index = r.nextInt(arr.length);
            }
            code[i1] = arr[index];
            //记录当前字符
            pre = index;
        }

        return new String(code);
    }
}