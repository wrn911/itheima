package demo5;

public class Student extends Person{
    public Student() {
        System.out.println("子类");
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
