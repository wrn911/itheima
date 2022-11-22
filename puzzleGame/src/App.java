import puzzle.GameJFrame;
import puzzle.LoginJFrame;
import puzzle.RegisterJFrame;

public class App {
    //启动入口
    public static void main(String[] args) {
        //需要使用那个界面,就创建哪个类的对象
        new LoginJFrame();
        //new GameJFrame();
        //new RegisterJFrame();
    }
}
