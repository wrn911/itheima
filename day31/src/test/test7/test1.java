package test.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建奖池
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建多线程要运行的参数对象
        MyCallable mc = new MyCallable(list);

        //创建多线程运行结果的管理者对象
        FutureTask<Integer> ft1 = new FutureTask<>(mc);
        FutureTask<Integer> ft2 = new FutureTask<>(mc);

        //创建线程对象
        Thread t1 = new Thread(ft1,"抽奖箱1");
        Thread t2 = new Thread(ft2,"抽奖箱2");

        //运行
        t1.start();
        t2.start();

        //获取结果
        Integer max1 = ft1.get();
        Integer max2 = ft2.get();

        System.out.println(max1);
        System.out.println(max2);

    }
}
