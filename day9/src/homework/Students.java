package homework;

public class Students {
    //学生的属性：学号，姓名，年龄。
    private int id;
    private String name;
    private int age;

    public Students(){
    }

    public Students(int id ,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
