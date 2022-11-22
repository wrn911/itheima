package homework1;

public class Rectangle extends Size {

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void square() {
        System.out.println("面积为" + (length * width));
    }

    @Override
    public void perimeter() {
        System.out.println("周长为" + (length + width) * 2);
    }
}
