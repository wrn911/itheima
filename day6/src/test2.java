public class test2 {
    public static void main(String[] args) {
        double area1 = getArea(5.4,1.7);
        double area2 = getArea(2.4,2.7);
        if (area1 > area2){
            System.out.println("第一个长方形更大");
        }else{
            System.out.println("第二个长方形更大");
        }
    }

    //要干什么?求长方形面积
    //需要什么?长 宽
    //是否需要返回值?是
    public static double getArea(double length , double width){
        double result = length * width;
        return result;
    }
}
