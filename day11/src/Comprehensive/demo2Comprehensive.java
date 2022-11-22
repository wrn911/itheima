package Comprehensive;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class demo2Comprehensive {
    public static void main(String[] args) {
        //定义列表存放学生对象
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {
            //打印登录界面
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.print("请输入您的选择:");


            String choose = sc.next();

            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("5：退出");
                    break loop;
                }
            }
        }
    }

    //"1：添加学生"
    public static void addStudent(ArrayList<Student> list) {
        /*键盘录入一个学生信息并添加，需要满足以下要求：
        * id唯一*/
        System.out.println("1：添加学生");
        Scanner sc = new Scanner(System.in);
        //先实例化一个学生对象
        Student stu = new Student();

        while (true) {
            System.out.println("请输入学生的id:");
            String sid = sc.next();
            //id唯一
            boolean flag = contains(list, sid);
            if (flag){
                //存在
                System.out.println("当前id:"+ sid + "已存在,请重新输入");
            }else {
                stu.setId(sid);
                break;
            }
        }

        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生的年龄:");
        String age = sc.next();
        stu.setAge(age);

        System.out.println("请输入学生的家庭地址:");
        String address = sc.next();
        stu.setAddress(address);

        list.add(stu);
        System.out.println("学生信息录入成功");
    }

    //"2：删除学生"
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("2：删除学生");
       /* 键盘录入要删除的学生id，需要满足以下要求：
        * id存在删除
        * id不存在，需要提示不存在，并回到初始菜单*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id:");
        String sid = sc.next();
        int index = getIndex(list, sid);
        if (index >= 0){
            list.remove(index);
            System.out.println("删除成功");
        }else{
            System.out.println("id为:" + sid + "的学生不存在,删除失败");
        }

    }

    //"3：修改学生"
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("3：修改学生");
        /*键盘录入要修改的学生id，需要满足以下要求
        * id存在，继续录入其他信息
        * id不存在，需要提示不存在，并回到初始菜单
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id:");
        String sid = sc.next();

        int index = getIndex(list,sid);
        if (index < 0){
            System.out.println("id为:" + sid + "的学生不存在,修改失败");
            return;
        }

        //若代码执行到这,说明id存在,可以进行修改
        Student stu = list.get(index);

        System.out.println("请输入要修改的学生姓名:");
        String name = sc.next();
        stu.setName(name);


        System.out.println("请输入要修改的学生年龄:");
        String age = sc.next();
        stu.setAge(age);

        System.out.println("请输入要修改的学生家庭地址:");
        String address = sc.next();
        stu.setAddress(address);

        System.out.println("修改成功");

    }

    //"4：查询学生
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("4：查询学生");
        /*打印所有的学生信息，需要满足以下要求
         *如果没有学生信息，提示：当前无学生信息，请添加后再查询
         *如果有学生信息，需要按照以下格式输出。（不用过于纠结对齐的问题）*/
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
        }else {
            System.out.println("id\t\t姓名\t年龄\t家庭住址");
            for (Student stu : list) {
                String id = stu.getId();
                String name = stu.getName();
                String age = stu.getAge();
                String address = stu.getAddress();
                System.out.println(id + "\t" + name + "\t" + age + "\t" + address);
            }
        }
    }

    //根据id判断学生对象是否存在
    public static boolean contains(ArrayList<Student> list,String id){
        //遍历,获取每个学生对象
        for (Student stu : list) {
            String sid = stu.getId();
            //判断是否存在
            if (sid.equals(id)) {
                return true;
            }
        }
        //若执行到这里,说明id不存在
        return false;
    }

    //根据id查询学生索引
    public static int getIndex(ArrayList<Student> list,String id){
        //遍历,获取学生对象
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            //获取id
            String sid = s.getId();
            //比较,返回索引
            if (sid.equals(id)){
                return i;
            }
        }
        //如果代码执行到这里,说明对象不存在,返回-1
        return -1;
    }
}
