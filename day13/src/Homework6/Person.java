package Homework6;

public class Person {
    private  String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Dog dog,String something){
        System.out.print("颜色为"+dog.getColor() + "的" +
                dog.getAge() + "岁的狗,");
        dog.eat(something);
    }

    public void keepPet(Cat cat,String something){
        System.out.print("颜色为"+cat.getColor() + "的" +
                cat.getAge() + "岁的狗,");
        cat.eat(something);
    }
}
