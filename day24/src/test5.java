import java.util.ArrayList;
import java.util.TreeMap;

public class test5 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";

        TreeMap<Character,Integer> map = new TreeMap<>();

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        for (char c : list) {
            if (map.containsKey(c)) {
                //存在
                //对应的值加一
                int value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                //不存在
                map.put(c, 1);
            }
        }

        //遍历
        map.forEach((c,count) -> System.out.print(c + "(" + count + ")"));
    }
}
