import java.util.Arrays;
import java.util.Comparator;

public class demo10 {
    public static void main(String[] args) {
        //方法引用
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        //倒序排序
        //匿名内部类
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/
        //lambda
        /*Arrays.sort(arr,(Integer o1, Integer o2)->{
            return o2 - o1;
                }
        );
        System.out.println(Arrays.toString(arr));*/
        //lambda简化形式
        /*Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));*/
        //方法引用
        Arrays.sort(arr,demo10::subtraction);
        System.out.println(Arrays.toString(arr));
    }

    public static int subtraction(int i1, int i2) {
        return i2 - i1;
    }

    public boolean stringJudge(String name) {
        return name.startsWith("张") && name.length() == 3;
    }
}
