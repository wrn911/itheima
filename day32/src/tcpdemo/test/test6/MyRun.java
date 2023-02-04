package tcpdemo.test.test6;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRun implements Runnable{
    Socket socket;

    public MyRun(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //创建流写出数据
            String name = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\86139\\Desktop\\" + name + ".png"));

            //获取数据
            //从连接通道中获取输入流
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }

            //发送响应信息
            OutputStream os = socket.getOutputStream();
            os.write("接收成功".getBytes());

            //释放资源
            bos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //释放资源
            if (socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
