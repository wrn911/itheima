import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class demo4 {
    public static void main(String[] args) {
        //第三种遍历方式 ---> lambda
        Map<String,String> map = new HashMap<>();
        map.put("a", "97");
        map.put("b","98");
        map.put("c","99");
        map.put("d","100");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });
        System.out.println("------------------------------------------------------------------------");
        map.forEach((String key, String value) -> {
                System.out.println(key + " = " + value);
            }
        );
        System.out.println("------------------------------------------------------------------------");
        map.forEach((String key, String value) -> System.out.println(key + " = " + value));
    }
}
