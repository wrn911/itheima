package homework4;

import java.util.ArrayList;
import java.util.Scanner;


public class LibraryManagementSystem {
    public static void main(String[] args) {
        //存储已保存的图书
        ArrayList<Book> list = new ArrayList<>();

        while (true) {
            //提供操作菜单，可以选择要进行的操作。
            System.out.println("-------------图书管理系统----------------");
            System.out.println("1.添加图书");
            System.out.println("2.查询所有图书");
            System.out.println("3.根据名称查询图书");
            System.out.println("4.根据编号删除图书");
            System.out.println("5.根据编号修改图书信息");
            System.out.println("6.退出");
            System.out.println("请输入要执行的操作:");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();

            switch (choose) {
                case "1" -> addBook(list);
                case "2" -> checkAll(list);
                case "3" -> checkOne(list);
                case "4" -> deleteBook(list);
                case "5" -> modifyBook(list);
                case "6" -> System.exit(0);
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //根据编号修改图书信息
    private static void modifyBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        int index;
        while (true) {
            System.out.println("请输入图书编号:");
            String ref = sc.next();
            index = checkByRef(list, ref);
            if (index < 0){
                System.out.println("编号为" + ref + "的图书不存在,请重新输入");
            }else {
                break;
            }
        }
        //修改
        Book book = list.get(index);
        System.out.println("请输入图书名称:");
        String bookName = sc.next();
        System.out.println("请输入图书作者:");
        String author = sc.next();
        System.out.println("请输入图书价格:");
        String price = sc.next();

        book.setBookName(bookName);
        book.setAuthor(author);
        book.setPrice(price);

    }
    //根据编号删除图书
    private static void deleteBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入图书编号:");
        String ref = sc.next();
        //根据编号返回索引
        int index = checkByRef(list,ref);
        if (index >= 0){
            list.remove(index);
            System.out.println("删除成功.");
        }else{
            System.out.println("编号为"+ ref +"的图书不存在,删除失败");
        }
    }


    //根据编号返回索引
    private static int checkByRef(ArrayList<Book> list, String ref) {
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (b.getRef().equals(ref)){
                return i;
            }
        }
        return -1;
    }


    //根据名称查询图书
    private static void checkOne(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            //输入图书名称
            System.out.println("请输入图书名称:");
            String bookName = sc.next();
            //根据名称查询编号,并返回索引
            int index = checkByname(bookName,list);
            //根据索引拿到图书对象
            if (index >= 0){
                Book book = list.get(index);
                //查询
                System.out.println("编号\t\t书名\t\t作者\t\t价格");
                check(book);
                break;
            }else {
                System.out.println("该图书"+ bookName +"不存在,请重新输入:");
                continue;
            }
        }

    }


    //根据名称查询编号,并返回索引
    private static int checkByname(String bookName, ArrayList<Book> list) {
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (b.getBookName().equals(bookName)){
                return i;
            }
        }
        return -1;
    }


    //2.查询所有图书
    private static void checkAll(ArrayList<Book> list) {
        System.out.println("编号\t\t书名\t\t作者\t\t价格");
        for (Book book : list) {
            check(book);
        }
    }

    //遍历图书信息
    private static void check(Book book) {
        String ref = book.getRef();
        String bookName = book.getBookName();
        String author = book.getAuthor();
        String price = book.getPrice();
        System.out.println(ref + "\t\t" + bookName + "\t\t" + author + "\t\t" + price);
    }

    //添加图书
    private static void addBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        //输入编号
        String ref;
        while (true) {
            System.out.println("请输入图书编号:");
            ref = sc.next();

            //判断是否唯一
            boolean flag = contains(list, ref);
            if (flag) {
                //说明编号已经存在
                System.out.println("编号已经存在,请重新输入");
                continue;
            } else {
                System.out.println("编号输入成功,开始输入其他信息.");
                break;
            }
        }
        //输入其他信息
        System.out.println("请输入图书名称:");
        String bookName = sc.next();
        System.out.println("请输入图书作者:");
        String author = sc.next();
        System.out.println("请输入图书价格:");
        String price = sc.next();
        //创建图书对象
        Book b = new Book(ref, bookName, author, price);
        //添加进列表
        list.add(b);
        System.out.println("图书添加成功!!");
    }


    //判断是否唯一
    private static boolean contains(ArrayList<Book> list, String ref) {
        for (Book book : list) {
            if (book.getRef().equals(ref)) {
                return true;
            }
        }
        return false;
    }
}
