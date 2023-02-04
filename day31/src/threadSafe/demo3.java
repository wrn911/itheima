package threadSafe;

public class demo3 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();
        MyThread1 t3 = new MyThread1();

        t1.setName("线程1");
        t2.setName("线程2");
        t3.setName("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
