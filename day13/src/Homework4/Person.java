package Homework4;

public class Person {
    private String name;
    private String gender;
    private int age;
    private String nationality;

    public Person() {
    }

    public Person(String name, String gender, int age, String nationality) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat(){
        System.out.println("吃点东西");
    }

    public void sleep(){
        System.out.println("浅睡一会");
    }

    public void work(){
        System.out.println("努力!!!!工作!!!!");
    }
}
