package test.test3;

public class test {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.start();
        mt2.start();
    }
}
