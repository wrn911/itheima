package threadSafe;

public class MyThread extends Thread{
    //表示这个类的对象,都共享ticket这个数据
    static int ticket = 0;

    //锁对象,一定要是唯一的
    static Object object = new Object();

    @Override
    public void run() {
        while (true){
            //同步代码块
            synchronized (object){
                if (ticket < 100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票!!!");
                }else {
                    break;
                }
            }
        }
    }
}
