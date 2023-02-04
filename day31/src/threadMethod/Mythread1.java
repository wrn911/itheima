package threadMethod;

public class Mythread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println(Thread.currentThread().getName() + "@" + i);
        }
    }
}
