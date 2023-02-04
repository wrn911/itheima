package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            String name = r.nextInt() + "";
            int flag = r.nextInt(2);
            String gender;
            if (flag == 0){
                gender = "男";
            }else {
                gender = "女";
            }
            int age = r.nextInt(30);
            Student s = new Student(name,gender,age);
            if (gender.equals("男")){
                for (int i1 = 0; i1 < 7; i1++) {
                    list.add(s);
                }
            }else {
                for (int i1 = 0; i1 < 3; i1++) {
                    list.add(s);
                }
            }
        }
        //System.out.println(list);

        for (int i = 0;i< 20;i++) {
            Collections.shuffle(list);
            System.out.println(list.get(0));
        }
    }
}
