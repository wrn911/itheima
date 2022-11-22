package homework1;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("1","2");
        Tutor t  = new Tutor("1","2");
        Maintainer m  = new Maintainer("1","2");
        Buyer b  = new Buyer("1","2");

        b.work();
        l.work();
        t.work();
        m.work();
    }
}
