package objectStream;

import java.io.*;

public class demo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day29\\src\\a.txt"));


        while (true) {
            try {
                Object o = ois.readObject();
                System.out.println(o);
            } catch (EOFException e) {
                break;
            }
        }


        ois.close();
    }
}
