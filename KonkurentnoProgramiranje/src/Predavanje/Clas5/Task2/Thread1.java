package Predavanje.Clas5.Task2;

import java.io.IOException;

public class Thread1 extends Thread{private ShareResource r1;
    private ShareResource r2;
    private ShareResource r3;

    public Thread1(ShareResource r1, ShareResource r2, ShareResource r3){
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
    }

    @Override
    public void run() {
        try {
            r1.test1(r3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
