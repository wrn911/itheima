public class test2 {
    public static void main(String[] args) {
        //山峰的高度
        double hight = 8844430;
        //纸张的厚度
        double paper = 0.1;
        //统计次数
        int count = 0;
        //编写循环表示折叠纸张,只要纸张厚度小于山峰的高度,循环就继续
        while(paper < hight){
            paper *= 2;
            count += 1;
        }
        System.out.println(count);
    }
}
