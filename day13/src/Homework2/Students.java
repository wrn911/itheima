package Homework2;

public class Students extends Role{

    private String whichClass;

    public Students() {
    }

    public Students(String name, int age, String whichClass) {
        super(name, age);
        this.whichClass = whichClass;
    }

    public String getWhichClass() {
        return whichClass;
    }

    public void setWhichClass(String whichClass) {
        this.whichClass = whichClass;
    }

    public void fillForm(){
        System.out.println("学生在填写听课反馈...");
    }
}
