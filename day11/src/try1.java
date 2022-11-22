public class try1 {
    public static void main(String[] args) {
        /*String s = new String("ab");
        switch (s){
            case "ab":
                System.out.println("hhhh");
                break;
            default:
                System.out.println("eeee");
        }*/

        while (true){
            System.out.println(1);
            lw:while (true){
                System.out.println(2);
                while(true){
                    System.out.println(3);
                    break lw;
                }
            }
        }
        //System.out.println("end");
    }
}
