package udpdemo.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        //接收数据

        //创建DatagramSocket对象
        //细节:
        //在接收的时候,一定要绑定端口
        //而且绑定的端口一定要跟发送的端口保持一致
        DatagramSocket ds = new DatagramSocket(10086);

        //接受数据包
        //若数组中有数据则会覆盖
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true) {
            //该方法是阻塞的
            //程序进行到这一步时,会在这里死等
            //等服务端发送消息
            ds.receive(dp);

            //解析数据包
            byte[] data = dp.getData();
            int length = dp.getLength();
            String id = dp.getAddress().getHostAddress();
            int port = dp.getPort();

            System.out.println("id为" + id +" 这台电脑的" + port +"端口说的: " + new String(data,0,length));
        }

        /*//释放资源
        ds.close();*/
    }
}
