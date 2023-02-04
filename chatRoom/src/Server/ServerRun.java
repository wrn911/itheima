package Server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Properties;

public class ServerRun implements Runnable {
    Socket socket;
    Properties prop;

    //从连接通道中获取输出流
    BufferedWriter bw = null;
    //从连接通道中获取输入流
    BufferedReader br = null;
    String name = null;
    String password = null;
    String flag = null;


    public ServerRun(Socket socket, Properties prop) {
        this.socket = socket;
        this.prop = prop;
    }

    //服务器线程
    @Override
    public void run() {
        //登录和注册
        try {
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //返回连接成功信息
        try {
            bw.write("服务器已经连接成功");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            String line = null;
            try {
                line = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //解析数据
            String[] split = line.split("&");
            name = split[0].split("=")[1];
            password = split[1].split("=")[1];
            flag = split[2];

            if ("login".equals(flag)) {
                //登录
                if (prop.containsKey(name) && prop.get(name).equals(password)) {
                    //服务器回写第一种提示：登录成功
                    System.out.println("用户" + name + "登录成功");
                    writeMessageToClient(socket,"1");
                    //登录成功后的逻辑
                    break;
                } else {
                    System.out.println("用户" + name + "登录失败");
                    if (prop.containsKey(name)) {
                        //服务器回写第二种提示：密码有误
                        writeMessageToClient(socket,"2");
                    } else {
                        //服务器回写第三种提示：用户名不存在
                        writeMessageToClient(socket,"3");
                    }

                }
            } else if ("register".equals(flag)) {
                //注册
                if (prop.containsKey(name)) {
                    System.out.println("用户名重复");
                    writeMessageToClient(socket,"用户名重复");
                } else {
                    System.out.println("注册成功");
                    writeMessageToClient(socket,"注册成功");
                    //将数据写入本地
                    prop.put(name, password);
                    FileWriter fw = null;
                    try {
                        fw = new FileWriter("D:\\Java\\IdeaProjects\\itheima\\chatRoom\\info.txt");
                        prop.store(fw, "");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                return;
            }
        }

        //登录成功后的逻辑
        //添加到在线用户集合
        Server.sockets.add(socket);
        System.out.println(Server.sockets);
        while (true) {
            //接收数据
            String line = null;
            try {
                line = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + "说: " + line);

            //群发消息
            for (Socket s : Server.sockets) {
                writeMessageToClient(s,(name + "说: " + line));
            }
        }
    }

    //发送消息
    private void writeMessageToClient(Socket s,String message){
        try {
            bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write(message);
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
