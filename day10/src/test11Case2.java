public class test11Case2 {
    public static void main(String[] args) {
        //旋转字符串并比较
        //两个字符串
        String str1 = "abcdef";
        String str2 = "bcdefa";
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
        //使用字符数组
        char frist = str.charAt(0);
        char[] arr = str.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = frist;
        return new String(arr);
    }
}
