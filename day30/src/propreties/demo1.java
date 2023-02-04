package propreties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        //添加数据
        //细节: 虽然我们可以添加任意类型的数据,但我们一般只会添加字符串
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","444");

        System.out.println(prop);
        //遍历
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
