import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<E> {
    private int size;
    //创建数组
    Object[] objs = new Object[10];

    public boolean add(E e){
        objs[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        //需做一个强转
        return (E) objs[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(objs);
    }
}
