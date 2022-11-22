import java.util.Random;

public class homework3 {
//    生成验证码
//    内容：可以是小写字母，也可以是大写字母，还可以是数字
//    规则：
//    长度为5
//    内容中是四位字母，1位数字。
//    其中数字只有1位，但是可以出现在任意的位置。
    public static void main(String[] args) {
        Random r = new Random();
        //随机生成字母
        String str = "";
        char[] arr = new char[52];
        //计数器
        int count = 0;
        //将a - z 放入数组
        for (int i = 65; i < 91; i++) {
            arr[count] = (char)i;
            count++;
        }
        for (int i = 97; i < 123; i++) {
            arr[count] = (char)i;
            count++;
        }

        //随机索引
        for (int i = 0;i < 4;i++) {
            int randomIndex = r.nextInt(52);
            str += arr[randomIndex];
        }
        //随机数
        str = str + r.nextInt(9);

        //打乱顺序
        char[] chars = str.toCharArray();
        int i = r.nextInt(4);
        char temp = chars[i];
        chars[i] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;

        System.out.println(new String(chars));



    }
//    //随机生成字母
//    public static char randomChar(){
//        Random r = new Random();
//        char c = r.nextInt()
//    }
}
