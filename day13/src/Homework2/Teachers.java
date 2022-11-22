package Homework2;

public class Teachers extends  Role{
    private String department;

    public Teachers() {
    }

    public Teachers(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void releaseQuestion(){
        System.out.println("老师发布了一个很难的文体.....");
    }
}
