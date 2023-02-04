import java.util.LinkedHashMap;

public class demo5 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();

        lhm.put("a",12);
        lhm.put("b",13);
        lhm.put("c",14);
        lhm.put("d",15);
        lhm.put("e",16);
        lhm.put("f",17);
        lhm.put("a",111);

        System.out.println(lhm);
    }
}
