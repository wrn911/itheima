package myReflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //利用反射获取构造方法

        //获取class文件
        Class<?> clazz = Class.forName("myReflect2.Student");

        /*Constructor<?>[] cons = clazz.getConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }*/


        /*Constructor<?>[] cons = clazz.getDeclaredConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }*/

        /*Constructor<?> con = clazz.getConstructor(int.class);
        System.out.println(con);*/

        Constructor<?> con = clazz.getDeclaredConstructor(String.class,int.class);
        System.out.println(con);

        //获取修饰符
        /*int modifiers = con.getModifiers();
        System.out.println(modifiers);*/

        //获取参数
        /*Parameter[] parameters = con.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }*/

        //创建对象
        //临时取消权限校验: 使得我们可以利用私有的构造创建对象
        con.setAccessible(true);
        Object stu = con.newInstance("zhangsan", 23);
        System.out.println(stu);
    }
}
