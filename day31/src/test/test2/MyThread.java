package test.test2;

public class MyThread extends Thread{
    public static int gift = 100;


    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if (gift <= 10){
                    break;
                }else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    gift--;
                    System.out.println(getName() + "送出一份礼物,还剩" + gift + "份礼物");
                }
                Thread.yield();
            }
        }
    }
}
