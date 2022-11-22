package homework2;

public class Test {
    public static void main(String[] args) {
        NewPhone n = new NewPhone();
        uesPhone(n);
    }

    public static void uesPhone(Phone p) {
        if (p instanceof NewPhone n){
            n.playGame();
            n.call();
            n.sendMessage();
        } else if (p instanceof  OldPhone o) {
            o.call();
            o.sendMessage();
        }else {
            System.out.println("呵呵...");
        }
    }


    /*public static void usePhone(Phone p){
        if (p instanceof NewPhone n){
            n.playGame();
            n.call();
            n.sendMessage();
        } else if (p instanceof  OldPhone o) {
            o.call();
            o.sendMessage();
        }else {
            System.out.println("呵呵...");
        }
    }*/
}
