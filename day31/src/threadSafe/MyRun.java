package threadSafe;

public class MyRun implements Runnable {
    //此时不用加static修饰,因为该类的对象只创建一次
    int ticket = 0;

    @Override
    public void run() {

        //循环
        while (true) {
            if (method()) break;
        }
    }

    //同步方法
    private synchronized boolean method() {
        if (ticket == 100) {
            //判断,已经到了末尾
            return true;
        } else {
            //判断,未到末尾
            ticket++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票!!!");
        }
        return false;
    }
}
