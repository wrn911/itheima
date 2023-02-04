package objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class demo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day29\\src\\a.txt"));
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        for (Student student : list) {
            System.out.println(student);
        }
        ois.close();
    }
}
