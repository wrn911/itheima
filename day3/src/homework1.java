public class homework1 {
    public static void main(String[] args) {
        double farther = 177.0;
        double mather = 165.0;
        double boy = (farther + mather) * 1.08 / 2;
        double girl = (farther * 0.923 + mather)  / 2;
        System.out.println("儿子的身高是" + boy);
        System.out.println("女儿的身高是" + girl);
    }
}
