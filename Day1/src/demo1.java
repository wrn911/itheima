import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //添加/覆盖
        System.out.println(map.put("a", "97"));
        map.put("b","98");
        map.put("c","99");
        map.put("d","100");
        System.out.println(map.put("d", "101"));

        //删除
        /*boolean a = map.remove("a", "97");
        System.out.println(a);
        System.out.println(map.remove("b"));*/

        //清空
        //map.clear();

        //判断是否包含
        //System.out.println(map.containsKey("a"));

        //System.out.println(map.containsValue("91"));

        //判断是否为空
        //System.out.println(map.isEmpty());

        //集合长度
        System.out.println(map.size());

        System.out.println(map);

    }
}
