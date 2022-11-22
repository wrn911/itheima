package demo5;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类");
    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
