import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        //泛型不具备继承性
        method(list1);
        /*method(list2);
        method(list3);*/

        //数据具备继承性
        list1.add(new Fu());
        list1.add(new Zi());

        //通配符
        method1(list1);
        method1(list2);
        method1(list3);

        method2(list1);
        method2(list2);
        method2(list3);
    }

    public static void method(ArrayList<Ye> ye){}
    //通配符:可传递Ye及Ye的所有子类类型
    public static void method1(ArrayList<? extends Ye> list){}
    //通配符:可传递Zi及Zi的所有父类类型
    public static void method2(ArrayList<? super Zi> list){}
}

class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}