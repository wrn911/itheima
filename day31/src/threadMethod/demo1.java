package threadMethod;

public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        /*MyThread t1 = new MyThread("啊啊啊");
        MyThread t2 = new MyThread("不不不");
        MyThread t3 = new MyThread("踩踩踩");

        t1.start();
        t2.start();
        t3.start();*/

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());

        System.out.println(111111111);
        //线程休眠指定时间,单位为毫秒
        Thread.sleep(1000);
        System.out.println(222222222);
    }
}
