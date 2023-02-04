package test1;

import java.text.ParseException;

public class Student {
    private String name;
    private int age;
    private String address;


    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    private void sleep(){
        System.out.println("在睡觉");
    }

    public String eat(String something) throws NoSuchFieldException, ParseException {
        System.out.println("在吃" + something);
        return "吃饱了";
    }

    public String eat(String something,int a) throws NoSuchFieldException, ParseException {
        System.out.println("在吃饭");
        return "吃饱了";
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
