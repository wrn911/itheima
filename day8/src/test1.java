import java.util.concurrent.Callable;

public class test1 {
    public static void main(String[] args) {
        Coder c = new Coder("李四",135,10000);
        Manager m = new Manager();

        m.setName("张三");
        m.setId(123);
        m.setSalary(15000);
        m.setBonus(6000);

        m.work();
        c.work();
    }
}

