import java.util.Scanner;

public class Goodstest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[4];
        Scanner sc = new Scanner(System.in);
        //键盘录入属性
        for (int i = 0; i < arr.length; i++) {
            //创建对象接收数据
            Goods good = new Goods();
            System.out.println("请输入id");
            int id = sc.nextInt();
            good.setId(id);
            System.out.println("请输入名称");
            String name = sc.next();
            good.setName(name);
            System.out.println("请输入价格");
            int price = sc.nextInt();
            good.setPrice(price);
            System.out.println("请输入库存");
            int store = sc.nextInt();
            good.setStore(store);

            //把对象交给数组
            arr[i] = good;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getId());
            System.out.println(arr[i].getPrice());
            System.out.println(arr[i].getStore());
            System.out.println(arr[i].getClass());
        }

        //求平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //获取对象
            Goods g = arr[i];
            sum += g.getPrice();
        }

        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
