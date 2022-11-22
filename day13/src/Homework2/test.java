package Homework2;

public class test {
    public static void main(String[] args){
        Students s = new Students("zhangsan",23,"7ban");
        Teachers t = new Teachers("lisi",24,"bailanbu");

        System.out.println(s.getWhichClass());
        System.out.println(s.getAge());
        System.out.println(s.getName());
        s.fillForm();

        System.out.println(t.getDepartment());
        System.out.println(t.getAge());
        System.out.println(t.getName());
        t.releaseQuestion();
    }
}
