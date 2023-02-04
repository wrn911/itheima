package objectStream;

import java.io.Serial;
import java.io.Serializable;

//标记型接口,表示当前javabean类可以被序列化
public class Student implements Serializable {
    //类的序列号,版本号
    //private: 表示不能被外界使用,也不提供get和set方法
    //static: 所有对象共享
    //final: 不可被修改
    @Serial
    private static final long serialVersionUID = -5317050275520342081L;
    private String name;
    private int age;
    //transient瞬态关键字,表示该变量不能被序列化
    private transient String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
