import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo1 {
    public static void main(String[] args) throws UnknownHostException {
        //获取InetAddress对象
        //IP的对象 一台电脑的对象
        //InetAddress address = InetAddress.getByName("192.168.10.106");
        //InetAddress address = InetAddress.getByName("redmi");
        InetAddress address = InetAddress.getByName("127.0.0.1");
        System.out.println(address);


        //获取此IP的主机名
        String name = address.getHostName();
        System.out.println(name);

        //获取IP地址
        String id = address.getHostAddress();
        System.out.println(id);


    }
}
