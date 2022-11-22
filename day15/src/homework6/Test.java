package homework6;

public class Test {
    public static void main(String[] args) {
        B b=new B(new InterB() {
            @Override
            public void showB() {

            }
        });
        b.methodB();
    }
}