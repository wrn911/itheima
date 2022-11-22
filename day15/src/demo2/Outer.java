package demo2;

public class Outer {
    int a ;

    class Inner {
        int a ;
        void method(){
            System.out.println("abc");
            new Inter(){
                @Override
                public void method() {
                    System.out.println("方法已被实现......");
                }
            }.method();
        }

        /*new Inter() {

        };*/
    }
}
