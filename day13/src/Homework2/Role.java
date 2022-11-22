package Homework2;

public class Role {
    private String name;
    private int age;

    public Role() {
    }

    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkLessonTable(){
        System.out.println("正在查阅课表......");
    }
}
