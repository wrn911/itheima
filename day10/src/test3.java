public class test3 {
    //字符串反转
    public static void main(String[] args) {
        String result = reverser("abcde");
        System.out.println(result);
    }

    public static String reverser(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

}
