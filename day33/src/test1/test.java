package test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IOException {
        Student s = new Student("zhangsan",23,"beijing");

        saveObject(s);
    }

    private static void saveObject(Student s) throws ClassNotFoundException, IllegalAccessException, IOException {
        //获取字节码对象
        Class<?> clazz = s.getClass();

        BufferedWriter bw = new BufferedWriter(new FileWriter("day33\\src\\test1\\a.txt"));

        //获取成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            //获取成员变量的名字
            String name = field.getName();
            //获取成员变量的值
            Object value = field.get(s);
            System.out.println(name + "=" + value);
            //写入
            bw.write(name + "=" + value);
            bw.newLine();
        }

        bw.close();
    }
}
