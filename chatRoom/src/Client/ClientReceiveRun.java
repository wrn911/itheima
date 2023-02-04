package Client;

import java.io.BufferedReader;
import java.io.IOException;

public class ClientReceiveRun implements Runnable{
    BufferedReader br;

    public ClientReceiveRun(BufferedReader br) {
        this.br = br;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (ClientReceiveRun.class){
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(line);
            }
        }
    }
}
