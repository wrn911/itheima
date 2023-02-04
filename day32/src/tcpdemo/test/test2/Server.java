package tcpdemo.test.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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
            //细节:
            //read方法会从连接通道中读取数据
            //但是,需要有一个结束标记,此处的循环才会停止
            //否侧程序会卡死在read方法中
            System.out.print((char) b);
        }

        //输出反馈信息
        OutputStream os = socket.getOutputStream();
        os.write("反馈".getBytes());


        //释放资源
        //断开连接
        socket.close();
        //关闭服务器
        ss.close();


    }
}
