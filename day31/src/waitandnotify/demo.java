package waitandnotify;

public class demo {
    public static void main(String[] args) {
        //创建线程对象
        Cook c = new Cook();
        Foodie f = new Foodie();

        //开启线程
        c.start();
        f.start();
    }
}
