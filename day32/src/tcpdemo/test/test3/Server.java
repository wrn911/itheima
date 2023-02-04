package tcpdemo.test.test3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10086);

        //创建流写出数据
        FileOutputStream fos = new FileOutputStream("C:\\Users\\86139\\Desktop\\xiduo.png");

        //监听客户端的链接
        Socket socket = ss.accept();

        //获取数据
        //从连接通道中获取输入流
        InputStream is = socket.getInputStream();
        int b;
        while ((b = is.read()) != -1){
            fos.write(b);
        }

        //发送响应信息
        OutputStream os = socket.getOutputStream();
        os.write("接收成功".getBytes());

        //释放资源
        os.close();
        socket.close();
        fos.close();
        ss.close();


    }
}
