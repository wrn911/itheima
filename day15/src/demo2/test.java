package demo2;

public class test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.method();

    }
}
