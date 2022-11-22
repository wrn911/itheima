public class test11Case1 {
    public static void main(String[] args) {
        //旋转字符串并比较
        //两个字符串
        String str1 = "abcdef";
        String str2 = "def";
        boolean result = compare(str1,str2);
        System.out.println(result);


    }

    //循环比较,最多比较str.length()次
    public static boolean compare(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            if(str1.equals(str2)){
                return true;
            }
            str1 = rotate(str1);
        }
        return false;
    }

    //旋转字符串
    public static String rotate(String str){
        //使用subString截取
        char frist = str.charAt(0);
        String end = str.substring(1);
        return end + frist;
    }
}
