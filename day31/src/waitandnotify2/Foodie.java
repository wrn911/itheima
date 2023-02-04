package waitandnotify2;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            //不断地从阻塞队列中获取面条
            try {
                String food = queue.take();
                System.out.println("吃货正在吃" + food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
