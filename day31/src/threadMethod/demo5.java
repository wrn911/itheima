package threadMethod;

public class demo5 {
    public static void main(String[] args) throws InterruptedException {
        Mythread2 mythread2 = new Mythread2();

        mythread2.setName("土豆");

        mythread2.start();

        //表示把这个线程插入到当前线程之前
        //当前线程: main
        mythread2.join();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
