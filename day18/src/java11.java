public class java11 {
    public static void main(String[] args) {
        String s = "我要月月月月月薪薪薪薪薪薪薪薪过过过过过过过百万万万万万万!!!!!!!!!!!!!!!!";

        String result = s.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
