public class test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int i1 = 2; i1 < i; i1++) {
                if( i % i1 == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i + "是一个质数");
                count++;
            }
        }
        System.out.println("共有" + count + "个质数");
    }
}
