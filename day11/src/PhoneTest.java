import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        //定义集合
        ArrayList<Phone> list = new ArrayList<>();
        //对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        //添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfo = getPhoneInfo(list);

        //遍历打印信息
        for (int i = 0; i < phoneInfo.size(); i++) {
            Phone p = phoneInfo.get(i);
            System.out.println(p.getBrand() + "," + p.getPrice());
        }
    }

    //定义方法,返回价格低于3000的手机的信息
    public static  ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        //定义结果列表
        ArrayList<Phone> resultList = new ArrayList<>();
        //遍历判断
        for (int i = 0; i < list.size(); i++) {
            int price = list.get(i).getPrice();
            if (price < 3000){
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
