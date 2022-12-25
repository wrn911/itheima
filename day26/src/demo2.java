import java.util.Set;

public class demo2 {
    public static void main(String[] args) {
        //细节:不能重复
        Set<Integer> set = Set.of(12, 2, 3, 4, 213, 654, 453, 57, 568, 1,1);
        System.out.println(set);
        set.add(10987);
    }
}
