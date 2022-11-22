import java.io.IOException;

public class demo2 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.maxMemory() / 1024 / 1024);
        System.out.println(runtime.totalMemory()/ 1024 / 1024);
        System.out.println(runtime.freeMemory()/ 1024 / 1024);
        while (true) {
            runtime.exec("shutdown -a");
        }
    }
}
