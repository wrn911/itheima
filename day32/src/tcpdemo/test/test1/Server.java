package tcpdemo.test.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建对象
        ServerSocket ss = new ServerSocket(10086);

        //监听客户端的链接
        Socket socket = ss.accept();

        //获取数据
        //从连接通道中获取输入流
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);

        int b;
        while ((b = isr.read()) != -1) {
            System.out.print((char) b);
        }
        System.out.println();


        //释放资源
        //断开连接
        socket.close();
        //关闭服务器
        ss.close();


    }
}
