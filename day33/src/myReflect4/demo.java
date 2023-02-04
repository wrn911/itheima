package myReflect4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //获取成员方法
        //获取字节码文件对象
        Class<?> clazz = Class.forName("myReflect4.Student");

        //利用反射获取成员方法
        /*Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        /*Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

        Method method = clazz.getMethod("eat", String.class);
        //System.out.println(method);

        //获取修饰符
        /*int modifiers = method.getModifiers();
        System.out.println(modifiers);*/

        //获取形参
        /*Parameter[] parameters = method.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }*/

        //获取方法名
        /*String name = method.getName();
        System.out.println(name);*/

        //获取异常
        /*Class<?>[] exceptionTypes = method.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }*/

        //方法运行
        Student s = new Student("张三",23,"天津");
        String result = (String) method.invoke(s, "汉堡包");
        System.out.println(result);


    }
}
