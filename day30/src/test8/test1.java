package test8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) throws IOException {
        //读取正确的用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\test8\\name.txt"));
        String line = br.readLine();
        String[] arr = line.split("&");
        String rightUsername = arr[0].split("=")[1];
        String rightPassword = arr[1].split("=")[1];

        //用户输入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();

        //判断
        if (rightUsername.equals(username) && rightPassword.equals(password)){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
