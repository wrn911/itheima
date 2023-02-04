package tcpdemo.test.test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        //获取对象
        Socket socket = new Socket("127.0.0.1",10086);
        Scanner sc = new Scanner(System.in);

        //从连接通道中获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //从连接通道中获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        while (true) {
            //写出数据
            System.out.println("请输入您想说的话: ");
            String line = sc.nextLine();
            if ("886".equals(line)){
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();

            //接收返回数据
            String line1 = br.readLine();
            System.out.println(line1);
        }

        //释放资源
        br.close();
        bw.close();
        socket.close();
    }
}
