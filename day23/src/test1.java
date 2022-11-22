public class test1 {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(123);
        list.add(123);
        list.add(342);
        list.add(234);

        System.out.println(list.get(3));

        System.out.println(list);
    }



}
