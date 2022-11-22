public class homework2 {
    public static void main(String[] args) {
        System.out.println(getMax(2,3,4));
    }
    public static int getMax(int a,int b, int c){
        int max = a;
        if (a < b){
            max = b;
        }
        if(max < c){
            max = c;
        }
        return max;
    }
}
