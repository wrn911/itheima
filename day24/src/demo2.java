import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class demo2 {
    public static void main(String[] args) {
        //第一种遍历方式 ----> 键找值
        Map<String,String> map = new HashMap<>();
        map.put("a", "97");
        map.put("b","98");
        map.put("c","99");
        map.put("d","100");

        //将键放到一个单列集合中
        Set<String> keys = map.keySet();

        //遍历集合
        /*//1.增强for
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        //2.迭代器
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }*/

        //3.lambda表达式
        keys.forEach( key -> {
                String value = map.get(key);
                System.out.println(key + " = " + value);
            });
    }
}
