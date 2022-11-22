package Homework5;

public class Manager extends Employee{
    private int bonus;

    public Manager() {

    }

    public Manager(String name, String workNumber, String salary, int bonus) {
        super(name, workNumber, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("残酷的压榨程序员......");
    }
}
