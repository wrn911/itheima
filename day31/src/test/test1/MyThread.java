package test.test1;

public class MyThread extends Thread {
    public static int ticket = 1000;

    @Override
    public void run() {
        while (true) {
            //注意同步代码块要写在循环内
            synchronized (MyThread.class) {
                if (ticket == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;
                    System.out.println(getName() + "卖出了一张票,还剩余" + ticket + "张票");
                    //Thread.yield();
                }
            }
        }
    }
}
