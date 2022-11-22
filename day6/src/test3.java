public class test3 {
    public static void main(String[] args) {
        //整数类型默认为int
        compare(1,2);
        //强转
        compare((byte) 1,(byte) 2);
        //先定义变量,用变量作为实参
        byte b1 = 1;
        byte b2 = 2;
        compare(b1,b2);
    }
    public static void compare(byte b1 , byte b2){
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(long l1 , long l2){
        System.out.println("long");
        System.out.println(l1 == l2);
    }
    public static void compare(int i1 , int i2){
        System.out.println("int");
        System.out.println(i1 == i2);
    }
    public static void compare(short s1 , short s2){
        System.out.println("short");
        System.out.println(s1 == s2);
    }
}
