package tcpdemo.test.test6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10086);

        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        while (true) {
            //监听客户端的链接
            Socket socket = ss.accept();

            //用线程池开启一个线程处理数据
            pool.submit(new MyRun(socket));
        }
        //不需关闭服务器
    }
}
