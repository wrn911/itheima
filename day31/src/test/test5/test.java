package test.test5;

public class test {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("抽奖箱1");
        mt2.setName("抽奖箱2");

        mt1.start();
        mt2.start();

    }
}
