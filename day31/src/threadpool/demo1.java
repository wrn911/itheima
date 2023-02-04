package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demo1 {
    public static void main(String[] args) {
        //获取线程池对象(无上限)
        //ExecutorService pool = Executors.newCachedThreadPool();

        //获取线程池对象(有上限)
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //提交任务
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        //关闭线程池
        pool.shutdown();

    }
}
