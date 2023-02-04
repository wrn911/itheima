package threadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread1 extends Thread {
    //表示这个类的对象,都共享ticket这个数据
    static int ticket = 0;

    //表示这个类的对象,都共享同一把锁
    static Lock lock = new ReentrantLock();

    /*//锁对象,一定要是唯一的
    static Object object = new Object();*/

    @Override
    public void run() {
        while (true) {
            /*//同步代码块
            synchronized (object){*/

            try {
                //手动上锁
                lock.lock();
                if (ticket < 100) {

                    Thread.sleep(100);

                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票!!!");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //释放锁
                lock.unlock();
            }

            //}
        }
    }
}
