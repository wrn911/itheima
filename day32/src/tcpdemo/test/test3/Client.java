package tcpdemo.test.test3;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket socket = new Socket("127.0.0.1", 10086);

        //创建流读取文件信息
        FileInputStream fis = new FileInputStream("C:\\Users\\86139\\Pictures\\xiduo.png");

        //获取输出流
        OutputStream os = socket.getOutputStream();

        int b;
        while ((b = fis.read()) != -1){
            //写出数据
            os.write(b);
        }

        //写一个结束标记(关流)
        socket.shutdownOutput();

        //接收响应信息
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        while ((b = isr.read()) != -1){
            //写出数据
            System.out.print((char) b);
        }

        //释放资源
        fis.close();
        socket.close();

    }
}
