import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        //批量添加
        Collections.addAll(list, 1, 25, 9, 3, 8, 41, 4, 5, 6, 7);
        System.out.println(list);
        System.out.println("================================================");

        //根据指定规则排序
        Collections.sort(list, (o1, o2) -> o2 - o1);
        System.out.println(list);
        System.out.println("================================================");

        //打乱顺序(只能是list类型)
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("================================================");

        //排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("================================================");

        //以二分查找法(在进行此调用之前，必须根据列表元素的自然顺序对列表进行升序排序)查找元素
        int i = Collections.binarySearch(list, 8);
        System.out.println(i);
        System.out.println("================================================");

        //使用指定元素填充集合
        ArrayList<Integer> newList = new ArrayList<>();
        Collections.addAll(newList, 1, 25, 9, 3, 8, 41, 4, 5, 6, 7);
        System.out.println(newList);
        Collections.fill(newList,1);
        System.out.println(newList);
        System.out.println("================================================");

        //拷贝
        Collections.copy(newList,list);
        System.out.println(list);
        System.out.println(newList);
        System.out.println("================================================");

        //根据默认自然排序获取最大最小值
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println("================================================");

        //交换集合中指定位置的元素
        Collections.swap(list,0,1);
        System.out.println(list);
        System.out.println("================================================");
    }
}
