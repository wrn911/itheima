package Client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //获取对象
        Socket socket = new Socket("127.0.0.1", 10086);
        Scanner sc = new Scanner(System.in);

        //从连接通道中获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //从连接通道中获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //接收返回数据
        String line = br.readLine();
        System.out.println(line);

        while (true) {
            //输入信息
            System.out.println("==============欢迎来到黑马聊天室================\n" +
                    "1.登录\n" +
                    "2.注册\n" +
                    "请输入您的选择：");
            String s = sc.nextLine();
            if ("1".equals(s)) {
                boolean flag = login(bw, br);
                if (flag) {
                    break;
                }
            } else if ("2".equals(s)) {
                register(bw, br);
            } else {
                System.out.println("没有这个选项");
            }
        }
        say(bw, br);
    }

    //登录方法
    private static boolean login(BufferedWriter bw, BufferedReader br) throws IOException {
        boolean flag = false;

        System.out.println("请输入用户名: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("请输入密码: ");
        String password = sc.nextLine();

        //连接服务器,比较
        bw.write("username=" + name + "&password=" + password + "&login");
        bw.newLine();
        bw.flush();

        //读取返回结果
        String line = br.readLine();
        switch (line) {
            case "1" -> {
                System.out.println("登录成功");
                //登陆成功之后的逻辑
                flag = true;
            }
            case "2" -> System.err.println("密码有误");
            case "3" -> System.err.println("用户名不存在");
        }
        return flag;
    }

    //注册方法
    private static void register(BufferedWriter bw, BufferedReader br) throws IOException {
        System.out.println("请输入用户名: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //对格式进行比较
        //要求1：长度：6~18位，纯字母，不能有数字或其他符号。
        if (!name.matches("[a-zA-Z]{6,18}")) {
            System.err.println("用户名不符合规范");
            return;
        }

        //对格式进行比较
        //要求2：密码长度3~8位。第一位必须是小写或者大写的字母，后面必须是纯数字。
        System.out.println("请输入密码(第一位必须是小写或者大写的字母，后面必须是纯数字。): ");
        String password = sc.nextLine();
        if (!password.matches("[a-zA-Z]\\d{2,7}")) {
            System.err.println("密码不符合规范");
            return;
        }


        //连接服务器,比较用户名是否唯一
        bw.write("username=" + name + "&password=" + password + "&register");
        bw.newLine();
        bw.flush();

        //读取返回结果
        String line = br.readLine();
        System.out.println(line);
    }

    //聊天的方法
    private static void say(BufferedWriter bw, BufferedReader br) throws IOException {
        //接收线程
        ClientReceiveRun clientReceiveRun = new ClientReceiveRun(br);
        new Thread(clientReceiveRun).start();
        //发送数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入想说的话(输入886退出): ");
            String str = sc.nextLine();
            if ("886".equals(str)) {
                System.exit(0);
                break;
            }
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }
}
