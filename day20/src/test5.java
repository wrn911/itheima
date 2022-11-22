public class test5 {
    public static void main(String[] args) {
        //实现parseInt方法

        //定义字符串
        String str = "9";
        //判断字符串是否满足要求
        //习惯:先过滤异常字符串
        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("字符串不符合要求");
        } else {
            System.out.println("字符串符合要求");
            int num = 0;
            //遍历字符串
            for (int i = 0; i < str.length(); i++) {
                //取出每一个字符
                char c = str.charAt(i);
                //进行拼接
                num = num * 10 + c - '0';
            }
            System.out.println(num);
            System.out.println(num + 1);
        }

    }
}
