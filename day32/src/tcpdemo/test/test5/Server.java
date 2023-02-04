package tcpdemo.test.test5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10086);

        while (true) {
            //监听客户端的链接
            Socket socket = ss.accept();

            //开启一个线程处理数据
            new Thread(new MyRun(socket)).start();
        }
        //不需关闭服务器
    }
}
