package Homework6;

public class Cat extends Animals{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse(){
        System.out.println("小猫抓到了一只大老鼠....");
    }
}
