public class demo1 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
        System.out.println(1);
    }
    public static void method2() {
        //method1();
        System.out.println(2);
    }
}
