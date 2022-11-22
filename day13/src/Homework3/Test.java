package Homework3;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone("华为",8999);
        Phone p2 = new Phone("华为",9999);
        Phone p3 = new Phone("小米",1199);

        p1.call();
        p2.playGame();
        p3.sendMessage();
        System.out.println("-------------------------------");

        System.out.println(p1.getSize());
        System.out.println(p2.getSize());
        p1.size = 4;
        System.out.println(p3.getSize());
    }
}
