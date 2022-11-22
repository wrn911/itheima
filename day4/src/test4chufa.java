public class test4chufa {
    public static void main(String[] args) {
        int beichushu = 100;
        int chushu = 3;
        int count = 0;
        while(beichushu >= chushu){
            beichushu -= chushu;
            count += 1;
        }
        System.out.println("商为" + count);
        System.out.println("余数为" + beichushu);
    }
}
