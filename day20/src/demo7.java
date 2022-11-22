public class demo7 {
    public static void main(String[] args) {
        //转换为二进制
        int num = 6;
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            //除二取余
            int remainder = num % 2;
            num /= 2;
            sb.insert(0, remainder);
        }
        String str = sb.toString();
        System.out.println(str);
        System.out.println(str + 1 );
    }
}
