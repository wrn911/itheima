import java.util.ArrayList;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //键盘录入1-100的整数并添加至集合中,直到集合中数据和超过200为止
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //键盘录入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入范围1-100内的一个整数:");
            String str = sc.nextLine();
            int i = Integer.parseInt(str);
            //判断数据是否满足要求
            if (i < 1 || i > 200) {
                System.out.println("数据超出范围1-100,请重新输入");
                continue;
            }
            //添加进集合
            list.add(i);

            //判断数据和
            int sum = getSum(list);
            if (sum > 200) {
                System.out.println(sum);
                break;
            }

        }
        //遍历集合验证
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
