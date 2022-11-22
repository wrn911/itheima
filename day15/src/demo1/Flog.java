package demo1;

public class Flog extends Animal implements Swim,inter{
    public Flog(String name, int age) {
        super(name, age);
    }

    public Flog() {
    }

    @Override
    public void eat() {
        System.out.println("青蛙正在吃虫子....");
    }

    @Override
    public void swim(String str) {
        System.out.println("小青蛙正在蛙泳.....");
    }

    @Override
    public void swim() {

    }
}
