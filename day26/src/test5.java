import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan", 23));
        list.add(new Student("lisi", 24));
        list.add(new Student("wangwu", 25));

        String[] arr = list.stream().map(new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName() + "-" + student.getAge();
            }
        }).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
