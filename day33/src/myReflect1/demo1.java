package myReflect1;

public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象的第一种方法
        Class clazz1 = Class.forName("myReflect1.Student");
        System.out.println(clazz1);

        //获取class对象的第二种方法
        Class clazz2 = Student.class;
        System.out.println(clazz2);

        //获取class对象的第三种方法
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);

        System.out.println("---------------------------------");
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz3 == clazz1);


    }
}
