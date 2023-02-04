package waitandnotify;

public class Cook extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count == 0){
                    break;
                }else {
                    //判断桌子上是否有食物
                    if (Desk.foodFlag == 1){
                        //有: 等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //没有: 做面条
                        System.out.println("厨师正在制作面条");
                        //做好面条后,唤醒顾客
                        Desk.lock.notifyAll();
                        //修改桌子上的状态
                        Desk.foodFlag = 1;
                    }
                }
            }
        }
    }
}
