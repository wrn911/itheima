package objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day29\\src\\a.txt"));
        Student o = (Student) ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
