package com.itheima.jiajianchengchu;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦程度(范围是0~10):");
        int i = sc.nextInt();
        System.out.println("请输入你对象的时髦程度(范围是0~10):");
        int x = sc.nextInt();
        boolean result = i > x;
        System.out.println(result);
    }
}
