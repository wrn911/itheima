package test.test6;


import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        MyThread mt1 = new MyThread(a1);
        MyThread mt2 = new MyThread(a2);

        mt1.setName("抽奖箱1");
        mt2.setName("抽奖箱2");

        mt1.start();
        mt2.start();

    }
}
