package objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo6 {
    public static void main(String[] args) throws IOException {
        Student s1 = new Student("zhangsan",23,"南京");
        Student s2 = new Student("lisi",24,"重庆");
        Student s3 = new Student("wangwu",25,"北京");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29\\src\\a.txt"));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        oos.close();
    }
}
