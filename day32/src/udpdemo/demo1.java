package udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //发送数据

        //创建DatagramSocket对象
        //细节:
        //绑定端口,以后我们就是通过这个端口往外发送
        //空参: 所有可用端口中随机选定一个进行使用
        //有参: 指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket();

        //打包数据
        String str = "ABC的风格";
        byte[] bytes = str.getBytes("UTF-8");
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);

        //发送数据
        ds.send(dp);

        //释放资源
        ds.close();
    }
}
