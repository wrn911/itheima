public class demo2Lambda {
    public static void main(String[] args) {
        method(
                () -> {
                    System.out.println("swimming");
                }
        );
    }

    public static void method(Swim swim) {
        swim.swimming();
    }
}
@FunctionalInterface
interface Swim {
    public void swimming();
}
