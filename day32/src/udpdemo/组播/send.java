package udpdemo.组播;

import java.io.IOException;
import java.net.*;

public class send {
    public static void main(String[] args) throws IOException {
        //发送数据
        //创建MulticastSocket对象
        //细节:
        //绑定端口,以后我们就是通过这个端口往外发送
        //空参: 所有可用端口中随机选定一个进行使用
        //有参: 指定端口号进行绑定
        MulticastSocket ms = new MulticastSocket();

        //打包数据
        String str = "ABC的风格";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);

        //发送数据
        ms.send(dp);

        //释放资源
        ms.close();
    }
}
