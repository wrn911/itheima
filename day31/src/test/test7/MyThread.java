package test.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.StringJoiner;


public class MyThread extends Thread{

    public static ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<Integer> resultList;
    private Map<String,String> map;
    private boolean flag = false;

    static {
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
    }

    public MyThread(ArrayList<Integer> resultList, Map<String,String> map) {
        this.resultList = resultList;
        this.map = map;
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
                    if (remove == 800){
                        map.put("threadName",getName());
                        flag = true;
                    }
                    resultList.add(remove);
                }
            }

            //写在同步代码块外,若写在同步代码块里面则另一个线程仍然没机会抢夺执行权
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        synchronized (MyThread.class) {
            System.out.println("在此次抽奖过程中," + getName() + "总共产生了" + resultList.size() + "个奖项.");
            System.out.print("  分别为: ");

            //结果
            StringJoiner sj = new StringJoiner(",");
            int sum = 0;
            int max = 0;

            //打印结果
            for (Integer i : resultList) {
                sum += i;
                if (i > max) {
                    max = i;
                }
                sj.add(i + "");
            }
            //判断是否获得最高奖项
            if (flag){
                map.put("max",max + "");
            }
            System.out.print(sj + "最高奖项为" + max + "元,总计金额为" + sum + "元");
            System.out.println();
        }
    }
}
