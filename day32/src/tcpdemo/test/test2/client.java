package tcpdemo.test.test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        //发送数据

        //创建对象
        Socket socket = new Socket("127.0.0.1", 10086);

        //从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("一条信息".getBytes());

        //写一个结束标记(关流)
        socket.shutdownOutput();

        //获取反馈数据
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

        //释放资源
        os.close();
        socket.close();

    }
}
