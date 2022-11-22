public class homework5 {
    public static void main(String[] args) {
        //请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
        String str = "上海自来水来自海上";
        boolean flag = check(str);
        if (flag){
            System.out.println(str + "是对称的字符串");
        }else{
            System.out.println(str + "不是对称的字符串");
        }

    }
    //请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。例如："abcba"、"上海自来水来自海上"均为对称字符串。
    public static boolean check(String str){
        //倒转字符串
        /*char[] arr = str.toCharArray();
        for (int i = 0,j = arr.length -1; i < j; i++,j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        String newStr = new String(arr);*/
        StringBuilder sb = new StringBuilder(str);
        String newStr  = sb.reverse().toString();
        //与原字符串比较
        if (newStr.equals(str)){
            return true;
        }else {
            return false;
        }
    }
}
