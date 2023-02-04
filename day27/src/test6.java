import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test6 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = getCount(new File("D:\\截图"));
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
    }
    //统计一个文件夹中每种文件的个数
    public static HashMap<String,Integer> getCount(File file){
        //定义集合统计文件
        HashMap<String,Integer> hm = new HashMap<>();
        //获取文件夹中的所有文件
        File[] files = file.listFiles();
        //遍历
        for (File f : files) {
            if (f.isFile()){
                //判断,若是文件,对应次数加一
                String name = f.getName();
                String[] s = name.split("\\.");
                if (s.length <= 1){
                    //如果文件无后缀名,则数组长度为一,
                    //不进行统计,继续执行下一次循环
                    continue;
                }
                //判断该后缀名是否已经出现过
                String str = s[s.length - 1];
                if (hm.containsKey(str)){
                    //是
                    int count = hm.get(str);
                    count++;
                    hm.put(str,count);
                }else {
                    //否
                    hm.put(str,1);
                }
            }else {
                //若是文件夹,递归
                HashMap<String, Integer> sonHM = getCount(f);
                //与原集合归并
                Set<Map.Entry<String, Integer>> entries = sonHM.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    //判断该后缀名是否已经出现过
                    if (hm.containsKey(key)){
                        //是
                        int count = hm.get(key);
                        count = count + value;
                        hm.put(key,count);
                    }else {
                        //否
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
