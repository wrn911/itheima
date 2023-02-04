package myReflect3;

import java.lang.reflect.Field;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //获取成员变量
        //获取class字节码文件对象
        Class<?> clazz = Class.forName("myReflect3.Student");

        //获取成员变量
        /*Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

        /*Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/

        Field name = clazz.getDeclaredField("name");
        //System.out.println(name);

        //获取权限修饰符
        /*int modifiers = name.getModifiers();
        System.out.println(modifiers);*/

        //获取成员变量的名字
        /*String name1 = name.getName();
        System.out.println(name1);*/

        //获取数据类型
        /*Class<?> type = name.getType();
        System.out.println(type);*/

        //获取成员变量的值
        Student s = new Student("张三",23,"北京");
        name.setAccessible(true);
        String str = (String) name.get(s);
        System.out.println(str);

        //修改对象里面记录的值
        name.set(s,"李四");
        System.out.println(s);
    }
}
