package com.itheima.jiajianchengchu;

public class 短路demo5 {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(true && false);
        System.out.println(false && true);

        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(true || false);
        System.out.println(false || true);

        //短路
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b <5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);//10

        //非短路
        int c = 10;
        int d = 10;
        boolean result1 = ++c < 5 & ++d <5;
        System.out.println(result1);
        System.out.println(c);
        System.out.println(d);//11
    }
}
