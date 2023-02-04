package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class Server {
    public static ArrayList<Socket> sockets = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10086);

        //先读取本地文件中所有的正确用户信息。
        Properties prop = new Properties();
        FileReader fr = new FileReader("chatRoom\\info.txt");
        prop.load(fr);
        fr.close();


        while (true){
            //监听客户端的链接
            Socket socket = ss.accept();
            System.out.println("服务器已经连接成功");
            //开启一个线程
            new Thread(new ServerRun(socket,prop)).start();
        }
    }
}
