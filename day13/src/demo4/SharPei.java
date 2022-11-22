package demo4;

public class SharPei extends Dog {
    @Override
    public void eat(String str) {
        super.eat();//吃狗粮
        System.out.println("狗在啃骨头" + str);
    }
}
