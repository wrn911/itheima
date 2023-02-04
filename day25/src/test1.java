import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {

        //定义集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","4","5","3","9","7","8","6","0");

        //随机点名
        //法一
        Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));

        //法二
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
