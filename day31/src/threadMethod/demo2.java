package threadMethod;

public class demo2 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"1");
        Thread t2 = new Thread(mr,"2");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
