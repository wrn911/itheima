package homework3;

import homework2.IPlay;

public class Zi extends Fun implements IPlay {
    @Override
    public void playGame() {
        System.out.println("玩游戏...");
    }

    @Override
    public void fun() {
        System.out.println("fun方法正在被调用.....");
    }
}
