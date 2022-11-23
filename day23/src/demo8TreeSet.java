import java.util.Comparator;
import java.util.TreeSet;

public class demo8TreeSet {
    public static void main(String[] args) {
        //第二种排序:比较器排序
        //o1:表示当前要添加的元素
        //o2:表示已经在红黑树中存在的元素

        //返回值:
        //负数:表示当前要添加的元素是小的,存左边
        //正数:表示当前要添加的元素是大的,存右边
        //0:表示当前要添加的元素已存在,舍弃
        //创建集合
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按字符串长度排序
                int result = o1.length() - o2.length();
                //如果长度一致,按字母顺序排序
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
            }
        });

        //添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}
