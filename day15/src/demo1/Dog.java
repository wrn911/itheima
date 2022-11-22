package demo1;

public class Dog extends Animal implements Swim{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("小狗正在吃骨头....");
    }

    @Override
    public void swim(String str) {
        System.out.println("小狗正在狗刨....");
    }
}
