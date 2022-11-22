package demo1;

public class Person {
    /*属性：
    姓名，年龄
    行为：
    keepPet(Dog dog,String something)方法
    功能：喂养宠物狗，something表示喂养的东西
    行为：
    keepPet(Cat cat,String something)方法
    功能：喂养宠物猫，something表示喂养的东西
    生成空参有参构造，set和get方法*/
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal a, String something){
        if (a instanceof Dog d){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+d.getColor()+"颜色的"+d.getAge()+"岁的狗");
            d.eat(something);
        }else if (a instanceof Cat c ){
            System.out.println("年龄为"+age+"岁的"+name+"养了一只"+c.getColor()+"颜色的"+c.getAge()+"岁的猫");
            c.eat(something);
        }else{
            System.out.println("没有这个动物");
        }
    }
}
