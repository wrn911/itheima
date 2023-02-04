import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo4 {
    public static void main(String[] args) {
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,1);
        hm.put(3,1);
        hm.put(4,1);
        hm.put(5,1);
        hm.put(6,1);
        hm.put(7,1);
        hm.put(8,1);
        hm.put(9,1);
        hm.put(10,1);
        hm.put(11,1);
        hm.put(12,1);
        hm.put(13,1);
        System.out.println(hm);
        //获取所有键值对对象
        Set<Map.Entry<Integer, Integer>> entries = hm.entrySet();
        //把entries变成一个数组
        //Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
        /*toArray方法底层会比较集合长度跟数组长度两者的大小
        如果集合长度 > 数组长度: 数组中放不下,此时会根据实际数据的个数,重新创建数组
        如果集合长度 < 数组长度: 数组中放的下,此时不会创建新的数组,而是直接用*/
        //Map map = Map.ofEntries(arr);

        //写法二
        Map map = Map.ofEntries(entries.toArray(new Map.Entry[0]));
        System.out.println(map);
        //写法三
        /*Map<Integer, Integer> map = Map.copyOf(hm);*/
        //map.put(16,16);
    }
}
