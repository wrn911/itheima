package demo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入姓名: ");
            String name = sc.next();
            try {
                gf.setName(name);
                break;
            } catch (NameFormatException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            System.out.println("请输入年龄: ");
            try {
                String ageStr = sc.next();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄中不能含有其他字符");
            }catch (AgeOutOfBoundsException e){
                e.printStackTrace();
            }
        }
        System.out.println(gf);
    }
}
