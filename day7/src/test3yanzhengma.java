import java.util.Random;

public class test3yanzhengma {
    public static void main(String[] args) {
        //定义数组
        char[] chs = new char[52];
        //强转
        for (int i = 0; i < 52; i++) {
            if(i <= 25){
                //大写
                chs[i] = (char)(65 + i);
            }else{
                //小写
                chs[i] = (char)(71 + i);
            }
            //System.out.print(chs[i] + " ");
        }
        //随机索引
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(52);
            result += chs[randomIndex];
        }
        //随机数
        int randomNumber = r.nextInt(9);
        result += randomNumber;
        System.out.println(result);
    }

}
