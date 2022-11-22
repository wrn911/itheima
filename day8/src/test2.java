public class test2 {
    public static void main(String[] args) {
        Cat c = new Cat("白色","布偶猫");
        Dog d = new Dog();

        d.setColor("白色");
        d.setBread("二哈");

        c.catchMouse();
        c.eat();

        d.eat();
        d.lookHouse();
    }
}
