package tcpdemo.test.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws IOException {
        //接收数据

        //创建对象
        Socket socket = new Socket("127.0.0.1",10086);
        Scanner sc = new Scanner(System.in);

        //从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();

        while (true) {
            System.out.println("请输入要说的话: ");
            String s = sc.nextLine();
            if ("886".equals(s)){
                break;
            }
            os.write(s.getBytes());
        }

        //释放资源
        os.close();
        socket.close();


    }
}
