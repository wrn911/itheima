package com.itheima.jiajianchengchu;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int addetion = first + second;
        boolean result = (first == 6) || (second == 6) || addetion % 6 == 0;
        System.out.println(result);
    }
}
