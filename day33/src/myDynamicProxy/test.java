package myDynamicProxy;

public class test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("cxk");
        Star star = ProxyUtil.creativeProxy(bigStar);

        //唱歌
        String s = star.sing("只因你太美");
        System.out.println(s);


    }
}
