import java.util.Arrays;

public class demo10 {
    public static void main(String[] args) {
        String s = "小诗诗skjdew18231s小惠惠ppdwod0wd13332小混混";

        String vs = s.replaceAll("\\w+", "vs");
        System.out.println(vs);
        String[] arr = s.split("\\w+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
