package test.test7;


import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        //记录当前线程抽到的奖
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true){
            synchronized (MyCallable.class){
                if (list.size() == 0){
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                }else {
                    Collections.shuffle(list);
                    Integer remove = list.remove(0);
                    boxList.add(remove);
                }
            }
        }

        //返回集合中的最大值
        return Collections.max(boxList);

    }
}
