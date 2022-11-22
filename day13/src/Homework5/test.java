package Homework5;

public class test {
    public static void main(String[] args) {
        Manager m = new Manager("zhangsan","001","1000000",900000);
        Coder c = new Coder("lisi","002","10000");

        m.work();
        System.out.println(m.getName());
        System.out.println(m.getWorkNumber());
        System.out.println(m.getSalary());
        System.out.println(m.getBonus());
        c.work();
        System.out.println(c.getName());
        System.out.println(c.getSalary());
        System.out.println(c.getWorkNumber());
    }
}
