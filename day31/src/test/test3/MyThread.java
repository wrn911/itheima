package test.test3;

public class MyThread extends Thread{
    public static int number = 1;

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class){
                if (number == 100){
                    break;
                }else {
                    if (number % 2 != 0){
                        System.out.println(getName() + "正在打印" + number);
                    }
                    number++;
                }
            }
        }
    }
}
