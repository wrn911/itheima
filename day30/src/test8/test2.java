package test8;

import java.io.*;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) throws IOException {
        //读取正确的用户名和密码
        BufferedReader br = new BufferedReader(new FileReader("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\test8\\name.txt"));
        String line = br.readLine();
        String[] arr = line.split("&");
        String rightUsername = arr[0].split("=")[1];
        String rightPassword = arr[1].split("=")[1];
        int count = Integer.parseInt(arr[2].split("=")[1]);

        if (count == 3) {
            System.out.println("该用户已被锁定");
            return;
        }

        //用户输入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        System.out.println("请输入密码:");
        String password = sc.nextLine();

        //判断
        if (rightUsername.equals(username) && rightPassword.equals(password)) {
            System.out.println("登陆成功");
            writeInfos(rightUsername,rightPassword,0);
        } else {
            count++;
            System.out.println("登陆失败,您还剩" + (3 - count) + "次机会");
            writeInfos(rightUsername,rightPassword,count);
        }
    }

    public static void writeInfos(String rightUsername, String rightPassword, int count) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Java\\IdeaProjects\\itheima\\day30\\src\\test8\\name.txt"));
        bw.write("Username="+rightUsername+"&Password="+rightPassword+"&Count=" + count);
        bw.close();
    }
}
