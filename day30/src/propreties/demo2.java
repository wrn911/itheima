package propreties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class demo2 {
    public static void main(String[] args) throws IOException {
        //向配置文件中写出数据
        Properties prop = new Properties();
        //添加数据
        //细节: 虽然我们可以添加任意类型的数据,但我们一般只会添加字符串
        prop.put("aaa","111");
        prop.put("bbb","222");
        prop.put("ccc","333");
        prop.put("ddd","444");

        FileWriter fw = new FileWriter("day30\\src\\propreties\\a.properties");
        //第二个参数: 批注
        prop.store(fw,"test");
    }
}
