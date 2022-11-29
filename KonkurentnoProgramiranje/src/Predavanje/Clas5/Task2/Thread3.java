package Predavanje.Clas5.Task2;

import java.io.IOException;

public class Thread3 extends Thread{
    private ShareResource r1;
    private ShareResource r2;
    private ShareResource r3;

    public Thread3(ShareResource r1, ShareResource r2, ShareResource r3){
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    @Override
    public void run() {
        try {
            r3.test3(r2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
