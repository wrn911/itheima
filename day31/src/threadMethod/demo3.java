package threadMethod;

public class demo3 {
    public static void main(String[] args) {
        //非守护线程结束后守护线程也会陆续结束
        Mythread1 mythread1 = new Mythread1();
        Mythread2 mythread2 = new Mythread2();

        mythread1.setName("女神");
        mythread2.setName("备胎");

        //把第二个线程设置为守护线程(备胎线程/舔狗线程)
        mythread2.setDaemon(true);

        mythread1.start();
        mythread2.start();
    }
}
