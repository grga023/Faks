package Vezbe.Clas2.Task3;

public class InfoThreadNum extends Thread{

    private volatile boolean isTerminated;
    public InfoThreadNum(int id, long sleep){
        this.isTerminated = false;
    }

    @Override
    public void run() {

    }

    public void terminateThread() {
        this.isTerminated = true;
    }
}
