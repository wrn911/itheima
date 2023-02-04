package test.test5;

import java.util.ArrayList;
import java.util.Collections;


public class MyThread extends Thread{

    public static ArrayList<Integer> list = new ArrayList<>();

    static {
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
    }

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                int length = list.size();
                if (length == 0){
                    break;
                }else {
                    Collections.shuffle(list);
                    int remove = list.remove(0);
                    System.out.println(getName() + "又产生了一个" + remove + "元大奖");
                }
            }

            //写在同步代码块外,若写在同步代码块里面则另一个线程仍然没机会抢夺执行权
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
