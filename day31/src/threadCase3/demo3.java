package threadCase3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class demo3 {
    //多线程第三种启动方式
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable对象,表示线程要执行的任务
        MyCallable mc = new MyCallable();

        //创建FutureTask的对象(作用: 管理多线程运行的结果)
        FutureTask<Integer> ft = new FutureTask<>(mc);

        //创建线程对象
        Thread t1 = new Thread(ft);

        //启动线程
        t1.start();

        //获取结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
