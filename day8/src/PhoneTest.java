public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("荣耀");
        p1.setPrice(1999);
        p1.setColor("白色");
        p1.call();
        p1.sendMessage();
    }
}
