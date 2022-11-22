package Comprehensive;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class demoComprehensive {
    //定义常量,提高代码可读性
    private static final String ENTRY = "1";
    private static final String LOGON = "2";
    private static final String FORGET_PASSWORD = "3";



    public static void main(String[] args) {
        //定义一个列表存放用户对象
        ArrayList<User> list = new ArrayList<>();

        //登录界面进行循环,以便进行多次操作
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("----------------------欢迎来到学生管理系统-----------------------");
            System.out.println("请选择操作:\n1登录\n2注册\n3忘记密码");

            String choose = sc.next();
            switch (choose) {
                case ENTRY -> {
                    boolean flag = entry(list);
                    if (flag){
                        //进行判断,判断成功后进入控制台
                        enterConsole();
                    }
                }
                case LOGON -> logon(list);
                /*//System.out.println(list.size());
                //list = logon(list);*/
                case FORGET_PASSWORD -> forgetPassword(list);
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //用户注册
    public static void logon(ArrayList<User> list) {
        System.out.println(list.size());

        System.out.println("2注册");
        Scanner sc = new Scanner(System.in);

        String name;
        String password;
        String idCard;
        String phoneNumber;


        while (true) {

            System.out.println("请输入用户名:");
            name = sc.next();

            int index = getIndexByName(list, name);

            if (index >= 0) {
                //如果索引大于等于0,说明用户存在
                System.out.println("用户名为" + name + "的用户已经存在,请重新输入");
            } else {
                //u.setName(name);
                boolean flag = tryUserName(name);
                if (flag) {
                    break;
                } else {
                    System.out.println("录入的用户名不合法,请重新输入");
                }

            }
        }

        while (true) {
            System.out.println("请输入密码:");
            password = sc.next();
            System.out.println("请再次输入密码:");
            String passwordTwo = sc.next();
            if (passwordTwo.equals(password)) {
                //如果一至,则退出循环,继续录入其他数据
                //u.setPassword(password);
                break;
            } else {
                System.out.println("两次密码不一致,请重新输入");
            }
        }

        while (true) {
            System.out.println("请输入身份证号码:");
            idCard = sc.next();
            boolean flag1 = tryIdCard(idCard);
            if (flag1) {
                //设置
                //u.setIdCardNumber(idCard);
                break;
            } else {
                System.out.println("输入的身份证号码不合法,请重新输入");
            }
        }

        while (true) {
            System.out.println("请输入手机号码:");
            phoneNumber = sc.next();
            boolean flag2 = tryPhoneNumber(phoneNumber);
            if (flag2) {
                //设置
                //u.setPhoneNumber(phoneNumber);
                break;
            } else {
                System.out.println("输入的电话号码不合法,请重新输入");
            }
        }
        //创建用户对象
        User u = new User(name,password,idCard,phoneNumber);
        //对象添加进入列表
        list.add(u);
        //返回结果
        System.out.println("添加成功");
        System.out.println(list.size());
        //return list;

    }


    //用户登录
    public static boolean entry(ArrayList<User> list) {
        System.out.println("1登录");
        Scanner sc = new Scanner(System.in);
        String name;
        while (true) {
            System.out.println("请输入用户名:");
            name = sc.next();
            int flag = getIndexByName(list,name);
            if (flag < 0){
                //用户不存在
                System.out.println("用户不存在");
                //return false;
                continue;
            }
            break;
        }
        //如果代码执行到这里,说明用户存在
        int count = 3;
        //录入密码
        while (count > 0) {
            System.out.println("请输入密码:");
            String inPassword = sc.next();

            //录入验证码
            String yanzhengma = yanZhengMa();
            System.out.println(yanzhengma);
            System.out.println("请输入验证码");
            String inYanzhengma = sc.next();
            //判断
            boolean flag1 = (inYanzhengma.equals(yanzhengma) && matchingPassword(list, name, inPassword));

            //flag1 = matchingPassword(list, name, inPassword);

            count--;

            if (flag1){
                System.out.println("登录成功!!");
                return true;
            }else {
                System.out.printf("验证码或密码错误请重新输入:(您还有%d次机会)",count);
                System.out.println();
            }
        }
        return false;
    }

    //忘记密码
    public static void forgetPassword(ArrayList<User> list) {
        System.out.println("3忘记密码");
        /*1，键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
        2，键盘录入身份证号码和手机号码
        3，判断当前用户的身份证号码和手机号码是否一致，
        如果一致，则提示输入密码，进行修改。
        如果不一致，则提示：账号信息不匹配，修改失败。*/
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("请输入用户名:");
        name = sc.next();
        int num = getIndexByName(list,name);
        if (num < 0){
            //用户不存在
            System.out.println("未注册");
            return;
        }

        System.out.println("请输入当前用户的身份证号码:");
        String inId = sc.next();

        System.out.println("请输入当前用户的手机号码:");
        String inPhoneNumber = sc.next();

        //判断当前用户的身份证号码和手机号码是否一致，
        boolean flag = matchingId(list,name,inId) && matchingPhoneNumber(list,name,inPhoneNumber);

        if (flag){
            //获取索引
            int index = getIndexByName(list,name);
            //创建对象
            User u = list.get(index);

            System.out.println("请输入要修改的密码:");
            String inPassword = sc.next();
            u.setPassword(inPassword);

            System.out.println("修改成功");
        }else{
            System.out.println("账号信息不匹配，修改失败");
        }
    }

    //登录进入控制台
    public static void enterConsole() {
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
            if (flag) {
                //存在
                System.out.println("当前id:" + sid + "已存在,请重新输入");
            } else {
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
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功");
        } else {
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

        int index = getIndex(list, sid);
        if (index < 0) {
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
        } else {
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
    public static boolean contains(ArrayList<Student> list, String id) {
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
    public static int getIndex(ArrayList<Student> list, String id) {
        //遍历,获取学生对象
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            //获取id
            String sid = s.getId();
            //比较,返回索引
            if (sid.equals(id)) {
                //System.out.println("看看我执行了吗");
                return i;
            }
        }
        //如果代码执行到这里,说明对象不存在,返回-1
        return -1;
    }

    //根据用户名查询用户索引
    public static int getIndexByName(ArrayList<User> list, String name) {
        //遍历,获取用户对象
        for (int i = 0; i < list.size(); i++) {
            User s = list.get(i);
            if (s != null){
                //获取id
                String sName = s.getName();
                //比较,返回索引
                if (sName.equals(name)) {
                    //System.out.println("看看我执行了吗");
                    return i;
                }
            }
        }
        //如果代码执行到这里,说明对象不存在,返回-1
        return -1;
    }

    //用户名验证
    public static boolean tryUserName(String name) {
        //用户名长度必须在3~15位之间
        int length = name.length();
        if (length < 3 || length > 15) {
            return false;
        }
        //只能是字母加数字的组合，但是不能是纯数字*/
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if ((c > 'a' && c < 'z') || (c > 'A' && c < 'Z') || (c > '0' && c < '9')) {

            } else {
                return false;
            }
        }
        //成功为true
        return true;
    }

    //身份证验证
    public static boolean tryIdCard(String idCard) {
        /*长度为18位
        不能以0为开头
        前17位，必须都是数字
        最为一位可以是数字，也可以是大写X或小写x*/


        //长度为18位
        if (idCard.length() != 18) {
            return false;
        }

        for (int i = 0; i < idCard.length() - 1; i++) {
            char c = idCard.charAt(i);
            //第一位
            if (i == 0) {
                //不能以0为开头
                if (c == '0') {
                    return false;
                }
            }

            if (c < '0' || c > '9') {
                //如果不是数字,返回false
                return false;
            }
        }
        //最后一位
        char c = idCard.charAt(idCard.length() - 1);
        if ((c < '9' && c >= '0') || c == 'x' || c == 'X') {

        } else {
            return false;
        }

        return true;
    }

    //电话号码验证
    public static boolean tryPhoneNumber(String phoneNumber) {
        /*长度为11位
        不能以0为开头
        必须都是数字*/


        //长度为11位
        if (phoneNumber.length() != 11) {
            return false;
        }

        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            //第一位
            if (i == 0) {
                //不能以0为开头
                if (c == '0') {
                    return false;
                }
            }

            if (c < '0' || c > '9') {
                //如果不是数字,返回false
                return false;
            }
        }
        return true;
    }

    //生成随机验证码
    public static String yanZhengMa(){
        //定义字符数组
        char[] arr = new char[5];
        //定义字符a - z数组
        char[] arr1 = new char[52];
        for (int i = 0; i < arr1.length; i++) {
            if (i <= 25){
                arr1[i] = (char)(i + 'A');
            }else {
                arr1[i] = (char)(i + 'a' - 26);
            }
        }
        //4次循环,生成前四个字母
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(52);
            arr[i] = arr1[index];
        }
        //生成最后一个数字
        int num = r.nextInt(9);
        arr[arr.length - 1] = (char)(num + '0');
        //最后一个数字与数组内任意元素换位
        int randomIndex = r.nextInt(5);
        char temp = arr[randomIndex];
        arr[randomIndex] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        //toString
        return new String(arr);
    }

    //根据用户名,判断用户另一属性是否与密码匹配
    public static boolean matchingPassword(ArrayList<User> list,String name,String attribute){
        int index = getIndexByName(list, name);
        if (index >= 0){
            //获取对象
            User u = list.get(index);
            return attribute.equals(u.getPassword());
        }else {
            System.out.println("用户不存在");
        }
        return false;
    }

    //根据用户名,判断用户另一属性是否与身份证号码匹配
    public static boolean matchingId(ArrayList<User> list,String name,String attribute){
        int index = getIndexByName(list, name);
        if (index >= 0){
            //获取对象
            User u = list.get(index);
            return attribute.equals(u.getIdCardNumber());
        }else {
            System.out.println("用户不存在");
        }
        return false;
    }

    //根据用户名,判断用户另一属性是否与电话匹配
    public static boolean matchingPhoneNumber(ArrayList<User> list,String name,String attribute){
        int index = getIndexByName(list, name);
        if (index >= 0){
            //获取对象
            User u = list.get(index);
            return attribute.equals(u.getPhoneNumber());
        }else {
            System.out.println("用户不存在");
        }
        return false;
    }
}


