import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        //键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可）
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入顾客的类别（0表示普通顾客，1表示会员）");
        int huiyuan = sc.nextInt();
        System.out.println("请输入购物的折前金额（整数即可）");
        int price = sc.nextInt();
        double total = 0;
        //分会员和非会员
        if(huiyuan == 1){
            if(price < 200){
                total = price * 0.8;
            }else{
                total = price * 0.75;
            }
        } else if(huiyuan == 0){
            if(price >= 100){
                total = price * 0.9;
            }else{
                total = price;
            }
        }else{
            System.out.println("输入的数字不合法");
        }
        System.out.println(total);
    }
}
