package homework5;

import demo2.Inter;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        A a = new A();
        a.methodA(z);
        a.methodA(new InterA() {
            @Override
            public void showA() {
                System.out.println("方法A已被重写");
            }
        });
    }
}
