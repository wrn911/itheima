public class try1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.show();
        System.out.print(a.name);
    }
}

class Animal {
    String name = "动物";

    public void show() {
        System.out.println("Animal ----- show");
    }
}


class Cat extends Animal {
    String name = "猫";

    @Override
    public void show() {
        System.out.println("Cat ----- show");
    }
}

class Dog extends Animal {
    String name = "狗";

    @Override
    public void show() {
        System.out.println("Dog ----- show");
    }
}