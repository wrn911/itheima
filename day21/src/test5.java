public class test5 {
    //爬楼梯
    //小明有时一次爬一个台阶,
    //有时一次爬两个台阶,如果这个楼梯有20个台阶,小明一共有多少中爬法呢
    public static void main(String[] args) {
        System.out.println(getCount(20));
    }
    public static int getCount(int n){
        if (n == 1){
            return 1;
        } else if (n == 2) {
            return 2;
        }else {
            return getCount(n-1) + getCount(n-2);
        }
    }
}
