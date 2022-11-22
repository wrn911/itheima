public class homework11 {
    public static void main(String[] args) {
        //1. 定义for循环，1949到2019的年份是循环次数。
        for (int i = 1949; i < 2019; i++) {
            //2. 对每个年份逐个判断，如果年份和2019的差值是12的倍数，说明这年是猪年
            if((2019 - i) % 12 == 0){
                System.out.println(i + "是猪年");
            }
        }

        //3. 打印符合条件的年份
    }
}
