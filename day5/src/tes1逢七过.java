public class tes1逢七过 {
    public static void main(String[] args) {
        //得到1到100的每一个数字
        for (int i = 1; i <= 100; i++) {
            //判断
            if(i % 10 == 7 || i /10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
