public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try {
            System.out.println(arr[10]);
            /**
             * 此处出现了异常,程序在这里创建一个ArrayIndexOutOfBoundsException对象,new ArrayIndexOutOfBoundsException()
             * 拿着这个对象到catch的小括号中对比,看括号中的变量是否可以接收到这个对象
             * 如果能接受,就表示该异常被捕获,执行catch中的语句
             * 当catch中的代码执行完毕继续执行try...catch体系下的其他代码
             */
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界异常");
        }
        System.out.println("看看我执行了吗");
    }
}
