package homework1;

public class Round extends Size{

    private double radius;
    private static double pi = 3.14;

    public Round(double radius) {
        this.radius = radius;
    }

    public Round() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Round.pi = pi;
    }

    @Override
    public void square() {
        System.out.println("面积为" + radius*radius*pi);
    }

    @Override
    public void perimeter() {
        System.out.println("周长为" + 2*radius*pi);
    }
}
