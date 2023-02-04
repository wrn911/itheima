package udpdemo.组播;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class receive1 {
    public static void main(String[] args) throws IOException {
        //接收数据

        //创建DatagramSocket对象
        //细节:
        //在接收的时候,一定要绑定端口
        //而且绑定的端口一定要跟发送的端口保持一致
        MulticastSocket ms = new MulticastSocket(10086);

        //将本机添加到224.0.0.1这一组中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //接受数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //该方法是阻塞的
        //程序进行到这一步时,会在这里死等
        //等服务端发送消息
        ms.receive(dp);

        //解析数据包
        byte[] data = dp.getData();
        int length = dp.getLength();
        String id = dp.getAddress().getHostAddress();
        int port = dp.getPort();

        System.out.println("id为" + id +" 这台电脑的" + port +"端口说的: " + new String(data,0,length));

        //释放资源
        ms.close();

    }
}
