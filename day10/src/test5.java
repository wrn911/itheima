public class test5 {
    public static void main(String[] args) {
        //获取手机号码
        String phone = "13212122222";
        String start = phone.substring(0, 3);
        String end = phone.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
