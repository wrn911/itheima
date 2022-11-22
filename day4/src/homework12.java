public class homework12 {
    public static void main(String[] args) {
        //1. 定义for循环，循环开始是1988，结束是2019
        for (int i = 1988; i < 2019; i++) {
            //2. 在循环中对年份进行判断
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                //3. 如果符合闰年的判断条件，则打印该年份
                System.out.println(i + "是闰年");
            }
        }
    }
}

