package homework3;

import homework2.IPlay;

public class Test {
    public static void main(String[] args) {
        /*Zi z = new Zi();
        z.playGame();
        z.fun();*/

        new IPlay(){
            @Override
            public void playGame() {
                System.out.println("玩游戏...");
            }
        }.playGame();

        new Fun(){
            @Override
            public void fun() {
                System.out.println("fun方法正在被调用.....");
            }
        }.fun();
    }
}
