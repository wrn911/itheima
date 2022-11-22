package demo3;

public class test {
    public static void main(String[] args) {
        Ragdoll rb = new Ragdoll();
        rb.eat();
        rb.drink();
        rb.catchMouse();


        System.out.println("------------------------------------------------------");
        Husky h = new Husky();
        h.drink();
        h.eat();
        h.lookHouse();
        h.breakHouse();



    }
}
