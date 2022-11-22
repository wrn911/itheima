import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //定义变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        //输入用户名和密码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            //比较
            if (username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("登录成功");
                break;
            }else{
                if (i == 2){
                    System.out.println("用户名为"+rightUsername+"的账户已被锁定");
                }else {
                    System.out.println("登录失败,用户名或密码错误,您还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }
}
