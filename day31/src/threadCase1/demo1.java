package threadCase1;

public class demo1 {
    //多线程第一种启动方式
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
