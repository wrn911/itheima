public class demo3hash {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);

        //如果没有重写hashCode方法,不同对象计算出的哈希值是不一样的
        //如果重写hashCode方法,不同对象只要属性相同,计算出的哈希值是一样的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //在小部分情况下,不同属性值或不同地址值计算出来的哈希值也有可能一样
        //哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
