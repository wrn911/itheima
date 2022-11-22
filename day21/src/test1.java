
import java.util.Arrays;
import java.util.Comparator;

public class test1 {
    //按数组长度排序
    public static void main(String[] args) {
        String[] arr = {"aa", "a", "aaaa", "aaa"};

        /*Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        //lambda完整格式
        Arrays.sort(arr, (String o1, String o2) -> {
                    return o1.length() - o2.length();
                }
        );
*/
        //lambda简写
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
