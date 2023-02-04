package tcpdemo.test.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Receive {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10086);

        //监听客户端的链接
        Socket socket = ss.accept();

        //从连接通道中获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //从连接通道中获取输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        while (true) {
            //输出数据
            String line = br.readLine();
            System.out.println(line);

            //返回数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

    }
}
