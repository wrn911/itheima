package tcpdemo.test.test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //创建ServerSocket对象
        ServerSocket ss = new ServerSocket(10086);

        //创建流写出数据
        String name = UUID.randomUUID().toString().replace("-", "");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\86139\\Desktop\\" + name + ".png"));

        //监听客户端的链接
        Socket socket = ss.accept();

        //获取数据
        //从连接通道中获取输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //发送响应信息
        OutputStream os = socket.getOutputStream();
        os.write("接收成功".getBytes());

        //释放资源
        os.close();
        socket.close();
        bos.close();
        ss.close();


    }
}
