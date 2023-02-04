package threadpool;

public class demo2 {
    public static void main(String[] args) {
        //返回Java虚拟机可用的处理器数目
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
