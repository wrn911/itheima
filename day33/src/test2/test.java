package test2;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //利用反射动态创建对象,调用方法

        //加载配置文件
        Properties prop = new Properties();
        prop.load(new FileReader("D:\\Java\\IdeaProjects\\itheima\\day33\\src\\test2\\a.properties"));

        //获取全类名和方法
        String classname = (String) prop.get("classname");
        String method = (String) prop.get("method");


        //加载class文件
        Class<?> clazz = Class.forName(classname);

        //获取构造方法
        Constructor<?> constructor = clazz.getConstructor();
        Object o = constructor.newInstance();

        //获取方法
        Method m = clazz.getDeclaredMethod(method);
        m.setAccessible(true);
        m.invoke(o);
    }
}
