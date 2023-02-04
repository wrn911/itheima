package threadMethod;

public class Mythread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + "@" + i);
        }
    }
}
