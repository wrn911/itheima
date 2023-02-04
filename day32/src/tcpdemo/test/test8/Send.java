package tcpdemo.test.test8;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        //发送数据
        //创建DatagramSocket对象
        //细节:
        //绑定端口,以后我们就是通过这个端口往外发送
        //空参: 所有可用端口中随机选定一个进行使用
        //有参: 指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket();
       /* Scanner sc = new Scanner(System.in);*/

        //接收数据
        //创建DatagramSocket对象
        //细节:
        //在接收的时候,一定要绑定端口
        //而且绑定的端口一定要跟发送的端口保持一致
        MulticastSocket ms = new MulticastSocket(10087);
        //将本机添加到224.0.0.1这一组中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        while (true) {
            //打包数据
            /*System.out.println("请输入想说的话(输入886退出): ");
            String str = sc.nextLine();
            if ("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes();
            address = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);
            //发送数据
            ds.send(dp);*/
            MyThread1 mt1 = new MyThread1(ds);
            mt1.start();

            //接受数据包
            /*byte[] bytes = new byte[1024];
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
            System.out.println("id为" + id +" 这台电脑的" + port +"端口说的: " + new String(data,0,length));*/
            MyThread2 mt2 = new MyThread2(ms);
            mt2.start();
        }

        //释放资源
        //ds.close();



    }
}
