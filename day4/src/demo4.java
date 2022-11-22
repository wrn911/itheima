import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        //键盘录入分数
        Scanner sc = new Scanner(System.in);

        //创建变量接受分数
        System.out.println("请输入分数");
        int grade = sc.nextInt();
        if(grade <= 100 && grade >= 0){
            //根据分数判断
            if(grade >= 95 && grade <= 100){
                System.out.println("送自行车一辆");
            }else if(grade <= 94 && grade >= 90){
                System.out.println("游乐场玩一天");
            }else if(grade <= 89 && grade >= 80){
                System.out.println("送变形金刚一个");
            }else{
                System.out.println("打一顿");
            }
        }else{
            System.out.println("不合法");
        }


    }
}
