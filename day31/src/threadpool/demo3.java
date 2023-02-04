package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class demo3 {
    public static void main(String[] args) {
        //自定义线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),//创建线程工厂
                new ThreadPoolExecutor.AbortPolicy()//任务拒绝策略
        );

        pool.submit(new MyRunnable());
    }
}
