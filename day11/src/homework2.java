import java.util.ArrayList;

public class homework2 {
    public static void main(String[] args) {
       /* 请定义教师（Teacher）类，属性包含姓名和专业名称。将若干教师对象存入ArrayList集合中，并遍历集合打印教师信息，格式如下：
        姓名：赵老师, 专业：javase
        姓名：钱老师, 专业：javaee
        姓名：孙老师, 专业：php
        姓名：李老师, 专业：python
*/
        ArrayList<Teacher> list = new ArrayList<>();

        //创建对象
        Teacher t1 = new Teacher("赵老师","javase");
        Teacher t2 = new Teacher("钱老师","javaee");
        Teacher t3 = new Teacher("孙老师","php");
        Teacher t4 = new Teacher("李老师","python");
        //添加对象
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

        //遍历打印
        for (Teacher t : list) {
            String name = t.getName();
            String project = t.getProject();
            System.out.println("姓名" + name + ", 专业：" + project);
        }
    }
}
