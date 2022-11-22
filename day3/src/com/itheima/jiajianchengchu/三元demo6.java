package com.itheima.jiajianchengchu;

import java.util.Scanner;

public class 三元demo6 {
    public static void main(String[] args) {
        //三个人中最大身高
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp = a > b ? a : b ;
        int result = temp > c ? temp : c;
        System.out.println(result);
    }
}
