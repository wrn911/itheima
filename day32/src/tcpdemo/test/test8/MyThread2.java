package tcpdemo.test.test8;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class MyThread2 extends Thread{
    private  MulticastSocket ms;

    public MyThread2(MulticastSocket ms) {
        this.ms = ms;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true){
            synchronized (MyThread2.class){
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                //该方法是阻塞的
                //程序进行到这一步时,会在这里死等
                //等服务端发送消息
                try {
                    ms.receive(dp);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                //解析数据包
                byte[] data = dp.getData();
                int length = dp.getLength();
                System.out.println(new String(data,0,length));
            }
        }
    }
}
