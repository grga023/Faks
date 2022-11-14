package Vezbe.Clas2.Task3;

import java.util.concurrent.ThreadLocalRandom;

public class InfoThreadNum extends Thread{

    private volatile boolean isTerminated;
    public InfoThreadNum(int id, long sleep){
        this.isTerminated = false;
    }

    @Override
    public void run() {
        System.out.println("Random number: "+getRandom());
    }
    public int getRandom(){
        int a = ThreadLocalRandom.current().nextInt();
        return a;
    }
    public void terminateThread() {
        this.isTerminated = true;
    }
}
