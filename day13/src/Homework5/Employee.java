package Homework5;

public class Employee {
    private String name;
    private String workNumber;
    private String salary;

    public Employee() {
    }

    public Employee(String name, String workNumber, String salary) {
        this.name = name;
        this.workNumber = workNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println("员工正在工作.....");
    }
}
