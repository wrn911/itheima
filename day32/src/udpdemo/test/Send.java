package udpdemo.test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
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
        Scanner sc = new Scanner(System.in);

        while (true) {
            //打包数据
            System.out.println("请输入想说的话(输入886退出): ");
            String str = sc.nextLine();
            if ("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);

            //发送数据
            ds.send(dp);
        }

        //释放资源
        ds.close();



    }
}
