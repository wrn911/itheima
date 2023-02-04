package waitandnotify;

public class Foodie extends Thread {
    @Override
    public void run() {
        //循环
        //同步代码块
        //判断是否共享数据到了末尾(到了)
        //判断是否共享数据到了末尾(没到)
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //判断桌子上是否有食物
                    if (Desk.foodFlag == 0) {
                        //没有: 等待
                        try {
                            Desk.lock.wait();//让当前线程跟锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        //把总数减一
                        Desk.count--;
                        //有: 吃
                        System.out.println("吃货正在吃面条,还能再吃" + Desk.count + "碗!!");
                        //吃完后,唤醒厨师继续做
                        Desk.lock.notifyAll();//唤醒跟这把锁绑定的所有线程
                        //修改桌子上的状态
                        Desk.foodFlag = 0;
                    }

                }
            }
        }
    }
}
