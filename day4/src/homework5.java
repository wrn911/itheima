import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        //键盘输入税前工资
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资");
        double gongzi = sc.nextInt();
        //设置变量记录要纳税部分,扣除三险一金后工资
        double sanxian = gongzi * 0.1;
        double need = gongzi * 0.9 - 5000;
        System.out.println(need);
        //设置变量记录纳税额
        double nashuie = 0;
        if(need < 0){
            nashuie = 0;
        } else if (need > 0 && need <= 3000) {
            nashuie = need * 0.03;
        } else if (need > 3000 && need <=12000 ) {
            nashuie = 3000 * 0.03 + (need - 3000) * 0.1;
        }else if (need > 12000 && need <= 25000 ) {
            nashuie = 3000 * 0.03 + 9000 * 0.1 + (need - 12000) * 0.2;
        }else if (need > 25000 && need <= 35000 ) {
            nashuie = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + (need - 25000) * 0.25;
        }else if (need > 35000 && need <= 55000 ) {
            nashuie = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + (need - 35000) * 0.3;
        }else if (need > 55000 && need <= 80000 ) {
            nashuie = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 2000 * 0.3 + (need - 55000) * 0.35;
        }else if (need > 80000 ) {
            nashuie = 3000 * 0.03 + 9000 * 0.1 + 13000 * 0.2 + 10000 * 0.25 + 2000 * 0.3 + 25000 * 0.35 + (need - 55000) * 0.45;
        }
        //设置变量记录税后工资
        System.out.println(nashuie);
        double shuihougongzi = gongzi * 0.9 - nashuie;
        System.out.println(shuihougongzi);

    }
}
