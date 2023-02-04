import java.util.ArrayList;
import java.util.function.Predicate;

public class demo12 {
    public static void main(String[] args) {
        /*
            创建集合添加元素，完成以下需求：
            1.把所有以“张”开头的元素存储到新集合中
            2.把“张”开头的，长度为3的元素再存储到新集合中
            3.遍历打印最终结果
        */
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

  /*      list1.stream()
                .filter(name -> name.startsWith("张"))
                .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));*/

  /*      list1.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.startsWith("张") && name.length() == 3;
            }
        }).forEach(name -> System.out.println(name));
*/

        //引用其他类的方法
        //静态方法中没用this
        list1.stream()
                .filter(new demo10() :: stringJudge)
                .forEach(name -> System.out.println(name));
    }
}
