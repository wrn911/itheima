import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9);

        Integer[] arr = list.stream().filter(s -> s % 2 == 0).toArray(value -> new Integer[value]);

        System.out.println(Arrays.toString(arr));
    }
}
