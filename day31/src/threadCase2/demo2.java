package threadCase2;

public class demo2 {
    //多线程第二种启动方式
    public static void main(String[] args) {

        //创建MyRun对象
        //表示多线程要执行的任务
        MyRun mr = new MyRun();

        //创建线程
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        //设置名字
        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
