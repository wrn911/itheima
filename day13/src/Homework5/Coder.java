package Homework5;

public class Coder extends  Employee{
    public Coder() {
    }

    public Coder(String name, String workNumber, String salary) {
        super(name, workNumber, salary);
    }

    @Override
    public void work() {
        System.out.println("程序员在拼死拼活的写代码......");
    }
}
