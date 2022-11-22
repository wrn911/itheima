import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        //键盘录入学生对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student stu =new Student();
            System.out.println("请输入姓名:");
            String name = sc.next();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();

            //把name和age赋值给学生对象
            stu.setName(name);
            stu.setAge(age);

            //添加进列表
            list.add(stu);
        }

        //遍历
        for (Student student : list) {
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
