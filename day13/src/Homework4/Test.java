package Homework4;

public class Test {
    public static void main(String[] args) {
        Students s = new Students("zhangsan","boy",23,"1","h1","001");
        Worker w = new Worker("lisi","girl",24,"2","h22h",23);
        StudentLeader sl = new StudentLeader("wangwu","girl",25,"1","h1","002","saodiyuan");

        s.work();
        w.work();
        sl.meeting();



    }
}
