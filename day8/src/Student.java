public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("我正在被调用");
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
