package test.test2;


public class test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();


        t1.setName("小a");
        t2.setName("小b");


        t1.start();
        t2.start();
    }
}
