import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //录入金额
        int price;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入金额:");
            price = sc.nextInt();
            if (price >= 0 && price <= 9999999){
                break;
            }else {
                System.out.println("输入的金额不合法,请重新输入");
            }
        }
        //整数变大写(查表法)
        String[] arr1 = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String str = "";
        while(price > 0){
            int ge = price % 10;
            price /= 10;
            String charStr = arr1[ge];
            str = charStr + str;
        }

        //补零
        //要补几个零
        int count = 7 - str.length();
        for (int i = 0; i < count; i++) {
            str = "零" + str;
        }

        //插入单位
        String result = "";
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);
    }
}
