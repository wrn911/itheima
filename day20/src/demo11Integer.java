public class demo11Integer {
    public static void main(String[] args) {
        //整数转二进制八进制十六进制
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);

        //八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);

        //十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);

        //字符串转整数
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i + 123);
    }
}
