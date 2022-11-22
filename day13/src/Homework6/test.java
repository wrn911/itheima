package Homework6;

public class test {
    public static void main(String[] args) {
        Cat cat = new Cat(2,"白色");
        Dog dog = new Dog(2,"黑色");
        Person person = new Person("张三",9);

        String s1 = "骨头";
        String s2 = "小鱼干";


        person.keepPet(cat,s2);
        person.keepPet(dog,s1);




    }
}
