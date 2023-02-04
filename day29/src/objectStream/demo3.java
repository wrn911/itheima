package objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class demo3 {
    public static void main(String[] args) throws IOException {
        //序列化多个对象
        Student s1 = new Student("zhangsan",23,"南京");
        Student s2 = new Student("lisi",24,"重庆");
        Student s3 = new Student("wangwu",25,"北京");
        //规定: 如果要序列化多个对象,要先将对象放到集合中
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29\\src\\a.txt"));

        //序列化对象
        oos.writeObject(list);

        //释放资源
        oos.close();
    }
}
