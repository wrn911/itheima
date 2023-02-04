package threadMethod;

public class demo4 {
    public static void main(String[] args) {

        Mythread3 mythread1 = new Mythread3();
        Mythread3 mythread2 = new Mythread3();

        mythread1.setName("女神");
        mythread2.setName("备胎");


        mythread1.start();
        mythread2.start();
    }
}
