import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-15","周芷若-14","赵敏-13","张强-30","张三丰-100","张村山-35","张良-35","王二麻子-40","谢广坤-41");

        Student[] arr = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
