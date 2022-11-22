public class homework6 {
    /*我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
    请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
    规则为：号码为18位，不能以数字0开头，前17位只可以是数字，
    最后一位可以是数字或者大写字母X。*/
    public static void main(String[] args) {
        String str = "39130120040223381X";
        System.out.println(check(str));
    }

    public static boolean check(String str){
        //号码为18位
        if (str.length() != 18){
            return false;
        }
        //不能以数字0开头
        /*char c1 = str.charAt(0);
        if (c1 == '0'){
            return false;
        }*/
        char[] arr = str.toCharArray();
        //不能以数字0开头
        if (arr[0] == '0'){
            return false;
        }
        //前17位只可以是数字
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] < 48 || arr[i] > 57){
                return false;
            }
        }
        //最后一位可以是数字或者大写字母X
        if (arr[arr.length-1] == 'X' || arr[arr.length -1] >= 48 && arr[arr.length -1] <= 57){
            return true;
        }else {
            return false;
        }
    }
}
