package demo6;

public class Test {
    public static void main(String[] args) {
        Cook c = new Cook();
        c.setId("heima001");
        c.setName("zhangsan");
        c.setSalary(100000);
        System.out.println(c.getId()+","+c.getName() + ", "+ c.getSalary());

        Manager m = new Manager("heima002","lisi",15000,23232);
        System.out.println(m.getId()+","+m.getName() +
                ", "+ m.getSalary() +  ", " + m.getBouns());

    }
}
