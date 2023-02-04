package threadMethod;

public class Mythread3 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + "@" + i);
            //表示出让当前cpu的执行权
            Thread.yield();
        }
    }
}
