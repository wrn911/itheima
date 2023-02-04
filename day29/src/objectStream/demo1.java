package objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo1 {
    public static void main(String[] args) throws IOException {
        Student s = new Student("zhangsan", 23,"山东");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day29\\src\\a.txt"));
        oos.writeObject(s);
        oos.close();
    }
}
