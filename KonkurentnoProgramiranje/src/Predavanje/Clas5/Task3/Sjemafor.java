package Predavanje.Clas5.Task3;

import java.util.concurrent.Semaphore;
public class Sjemafor {
    private volatile boolean  pristup;
    private Semaphore semaphore;

    public Sjemafor(boolean pristup){
        this.pristup = pristup;
        start();
    }

    private void start(){
        if(pristup){
            semaphore = new Semaphore(1);
        }
        else semaphore = new Semaphore(0);
    }

    public void permit() throws InterruptedException {
        semaphore.acquire();
    }

    public void odpusti(){
        semaphore.release();
    }
}