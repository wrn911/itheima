package com.itheima.jiajianchengchu;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");
        int number = sc.nextInt();

        //获取个位,十位,百位
        System.out.println("个位是" + number % 10);
        System.out.println("十位是" + number / 10 % 10);
        System.out.println("百位是:" + number / 100 % 10);
    }
}
