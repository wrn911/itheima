public class homework13 {
    public static void main(String[] args) {
        int i = 1988;
        while(i <= 2019){
            //2. 在循环中对年份进行判断
            if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                //3. 如果符合闰年的判断条件，则打印该年份
                System.out.println(i + "是闰年");
            }
            i++;
        }
    }
}
