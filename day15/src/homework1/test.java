package homework1;

public class test {
    public static void main(String[] args) {
        Round r1 = new Round(4);
        Rectangle r2 = new Rectangle(2, 4);


        r1.square();
        r1.perimeter();

        System.out.println("=======================================================================");

        r2.perimeter();
        r2.square();
    }

}
