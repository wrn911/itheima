package tcpdemo.test.test5;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建对象
        Socket socket = new Socket("127.0.0.1", 10086);

        //创建流读取文件信息
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\86139\\Pictures\\xiduo.png"));

        //获取输出流
        OutputStream os = socket.getOutputStream();

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1) {
            //写出数据
            os.write(bytes, 0, len);
        }

        //写一个结束标记(关流)
        socket.shutdownOutput();

        //接收响应信息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);

        //释放资源
        socket.close();

    }
}
