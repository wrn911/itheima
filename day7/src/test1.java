import java.util.Scanner;

public class test1 {
    //键盘录入月份,舱位,票价
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的票价:");
        int ticket = sc.nextInt();
        System.out.println("请输入你的月份:");
        int month = sc.nextInt();
        System.out.println("请输入你的舱位(0头等舱,1经济舱):");
        int seat = sc.nextInt();
        //根据月份,舱位判断折扣
        if (month >= 5 && month < 11) {
            //旺季
            ticket = getTicket(seat, ticket, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month == 11 && month == 12)) {
            //淡季
            ticket = getTicket(seat, ticket, 0.7, 0.65);
        } else {
            System.out.println("输入的月份不合法");
        }
        System.out.println(ticket);
    }

    private static int getTicket(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            ticket = (int) (ticket * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }

}
