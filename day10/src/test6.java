public class test6 {
    public static void main(String[] args) {
        //身份证号码
        String id = "372322200402187423";

        //获取年月日信息
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("身份信息为:");
        System.out.println("出生年月日为:" + year + "年" + month + "月" + day + "日");

        //获取性别信息
        char gender = id.charAt(16);
        //System.out.println(gender);
        //字符类型转整数类型
        int genderNum = gender - 48;
        //System.out.println('0' + 0);
        if (genderNum % 2 == 0){
            System.out.println("性别为:女");
        }else{
            System.out.println("性别为:男");
        }
    }
}
