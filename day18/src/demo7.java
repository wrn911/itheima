import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo7 {
    public static void main(String[] args) throws IOException {
        //创建一个url对象
        URL url = new URL("http://sfz.uzuzuz.com/?region=350781&birthday=19640307&sex=2&num=19&r=86");
        //连接上这个网络
        URLConnection conn = url.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String regex = "[1-9]\\d{16}[\\dXx]";
        Pattern p = Pattern.compile(regex);
        //按行读取
        //如果有下一行
        while((line = br.readLine()) != null){
            Matcher m = p.matcher(line);
            while (m.find()){
                System.out.println(m.group());
            }
        }
        br.close();
    }
}
