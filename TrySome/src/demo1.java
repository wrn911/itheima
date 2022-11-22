public class demo1 {
    public static void main(String[] args) {
        String password = "o4e3w2d1dd1d2w3e4o";
        /*for (int i = 0; i < str.length(); i+=2) {
            String substring = str.substring(i, i + 2);
            int i1 = Integer.parseInt(substring);
            System.out.println(i1);
        }*/

        /*password = "oewdd" + password;
        int length = password.length();
        char[] arr = new char[length * 2];
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i);
            char c1 = password.charAt(length - i - 1);
            arr[2*i] = c;
            arr[2*i+1] = c1;
        }
        System.out.println(new String(arr));*/
        int length = password.length()/2;
        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            char c = password.charAt(i*2);
            arr[i] = c;
        }
        String truePassword1 = new String(arr);
        String truePassword = truePassword1.substring(5);
        System.out.println(truePassword);
    }
}
