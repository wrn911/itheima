import java.util.ArrayList;

public class homework1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");

        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s + " ");
        }
    }
}
