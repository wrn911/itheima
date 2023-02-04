package tcpdemo.test.test8;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MyThread1 extends Thread{
    private DatagramSocket ds;

    public MyThread1(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){
            synchronized (MyThread1.class){
                //打包数据
                System.out.println("请输入想说的话(输入886退出): ");
                String str = sc.nextLine();
                if ("886".equals(str)){
                    break;
                }
                byte[] bytes = str.getBytes();
                InetAddress address = null;
                try {
                    address = InetAddress.getByName("127.0.0.1");
                } catch (UnknownHostException e) {
                    throw new RuntimeException(e);
                }
                int port = 10086;
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length,address,port);
                //发送数据
                try {
                    ds.send(dp);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
