package test.test7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        Map<String,String> map = new HashMap<>();

        MyThread mt1 = new MyThread(a1,map);
        MyThread mt2 = new MyThread(a2,map);

        mt1.setName("抽奖箱1");
        mt2.setName("抽奖箱2");

        mt1.start();
        mt2.start();

        mt1.join();
        mt2.join();

        System.out.println("在此次抽奖过程中," + map.get("threadName") + "中产生了最大奖项,该奖项金额为" + map.get("max") + "元");
    }
}
