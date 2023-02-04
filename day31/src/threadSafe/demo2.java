package threadSafe;

public class demo2 {
    public static void main(String[] args) {
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr,"窗口1");
        Thread t2 = new Thread(mr,"窗口2");
        Thread t3 = new Thread(mr,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
