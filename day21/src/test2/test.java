package test2;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        //按照年龄大小进行排序,若年龄相同则按身高排序,若身高相同则按姓名的字母进行排序
        GirlFriend gf1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend gf2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend gf3 = new GirlFriend("xiaohuihui", 19, 1.78);
        GirlFriend gf4 = new GirlFriend("axiaohuihui", 18, 1.67);

        //数组
        GirlFriend[] arr = {gf1, gf2, gf3, gf4};

        //匿名内部类进行排序
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0) {
                    return 1;
                } else if (temp < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        //打印
        System.out.println(Arrays.toString(arr));

        //lambda表达式进行排列
        Arrays.sort(arr, (o1, o2) -> {
            double temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            } else {
                return 0;
            }
        });

        //打印
        System.out.println(Arrays.toString(arr));
    }
}
