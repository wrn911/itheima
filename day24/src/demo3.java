import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class demo3 {
    public static void main(String[] args) {
        //第二种遍历方式 ---> 键值对
        Map<String,String> map = new HashMap<>();
        map.put("a", "97");
        map.put("b","98");
        map.put("c","99");
        map.put("d","100");

        //获取键值对对象,返回set集合
        Set<Entry<String, String>> entries = map.entrySet();
        //或写作Set<Map.Entry<String, String>> entries = map.entrySet();

        //增强for
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        //迭代器
        Iterator<Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        //lambda表达式
        entries.forEach(entry -> {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + " = " + value);
            }
        );
    }
}
