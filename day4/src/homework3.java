import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        //不同的年利率
        double yi = 0.0225;
        double er = 0.027;
        double san = 0.0325;
        double wu = 0.036;
        //录入年限,金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int dollar = sc.nextInt();
        System.out.println("请输入年限");
        int year = sc.nextInt();
        if(dollar > 1000){
            //判断,确定利率
            double lilv;
            if(year == 1){
                lilv = yi;
            } else if (year == 2) {
                lilv = er;
            } else if (year == 3) {
                lilv = san;
            } else if (year == 5) {
                lilv = wu;
            }else{
                lilv = 0;
                System.out.println("没有这个年份");
            }

            if(lilv != 0){
                double total = dollar + dollar * lilv * year;
                System.out.println(total);
            }
        }
    }
}
