import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class demo13 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌-15","周芷若-14","赵敏-13","张强-30","张三丰-100","张村山-35","张良-35","王二麻子-40","谢广坤-41");
/*
        Set<Student> set = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String[] split = s.split("-");
                String name = split[0];
                int age = Integer.parseInt(split[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toSet());
        System.out.println(set);*/

        //引用构造方法
        List<Object> newList = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList);
    }
}
