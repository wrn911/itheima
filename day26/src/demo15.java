import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class demo15 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);

        /*Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });*/

        //数组长度即为流中数据的个数
        Integer[] arr = list.stream().toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
