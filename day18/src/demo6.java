public class demo6 {
    public static void main(String[] args) {
        //身份证号码
        //前六位:地区 第一位不能是0,后面5位是任意数字
        //年的前半段 19 20
        //后半段 两个任意数字
        //月份 1-9 10 11 12
        //日期 01 - 31 (0[1-9]|[12]\\d|30|31)
        //最后四位 任意数字出现三次,最后一位也可以是大写的X或小写的x
        String regex1 = "[1-9]\\d{5}(19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[12]\\d|30|31)\\d{3}[\\dXx]";
        System.out.println("372301200402233814".matches(regex1));
        System.out.println("37230120040223381x".matches(regex1));
        System.out.println("372301200402323814".matches(regex1));
        System.out.println("372301180402233814".matches(regex1));
        String regex2 = "[1-9]\\d{5}(18|19|20)\\d{2}(0\\d|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        System.out.println("======================================================================================================");
        //邮箱
        //任意字符
        //@
        //任意字母加数字,只能出现2-6次(无下划线)
        //.
        //大小写字母均可,只能出现2-3次
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3})+";
        System.out.println("1274590986@qq.com".matches(regex3));
        System.out.println("1274590986@123.com".matches(regex3));
        System.out.println("1274590986@qq.com.cn".matches(regex3));
        System.out.println("1274590986@qq.edu".matches(regex3));
        System.out.println("======================================================================================================");
        //手机号
        //第一位是1
        //第二位是3-9
        //剩余9位是任意数字
        String regex4 = "1[3-9]\\d{9}";
        System.out.println("13954398775".matches(regex4));
        System.out.println("03954398775".matches(regex4));
        System.out.println("233954398775".matches(regex4));
    }
}
