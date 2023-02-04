package test.test4;

import java.util.Random;

public class MyThread extends Thread {
    public static int number = 10000;
    public static int count = 0;

    @Override
    public void run() {

        synchronized (MyThread.class) {
            count++;
            if (count > 3) {
                System.out.println(getName() + "没抢到");
            } else if (count == 3) {
                System.out.println(getName() + "抢到了" + (number / 100.0) + "元,还剩0元");
            } else {
                Random r = new Random();
                //至少抢到0.01块,不能全抢完
                int i = r.nextInt(number) + 1;
                number -= i;
                System.out.println(getName() + "抢到了" + (i / 100.0) + "元,还剩" + (number / 100.0) + "元");
            }
        }
    }
}
