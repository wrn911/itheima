import java.util.Map;

public class demo3 {
    public static void main(String[] args) {
        //细节:不能重复,键值对不能多于10个
        Map<Integer, Integer> map = Map.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10);
        System.out.println(map);
    }
}
