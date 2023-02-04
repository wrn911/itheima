package waitandnotify;

public class Desk {
    //作用: 控制生产者和消费者执行
    //是否有面条 0: 没有 1: 有(使用int使得可以定义更多的线程状态)
    public static int foodFlag = 0;

    //总个数
    public static int count = 10;

    //锁对象
    public static Object lock = new Object();
}
