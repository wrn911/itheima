public class homework1 {
    public static void main(String[] args) {
        System.out.print(getMin(1.2,124.2));
    }
    public static double getMin(double num1,double num2){
        if (num1 < num2){
            return num1;
        } else{
            return num2;
        }

    }
}
