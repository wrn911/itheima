public class demo1 {
    public static void main(String[] args) {
        //判断质数
        System.out.println(isPrime(997));
        System.out.println(isPrime1(997));
    }

    public static boolean isPrime(int number){
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
    public static boolean isPrime1(int number){
        int count = 0;
        for (int i = 2; i < number; i++) {
            count++;
            if (number % i == 0){
                return false;
            }
        }
        System.out.println(count);
        return true;
    }
}
