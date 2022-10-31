package Vezbe.Clas2.Task3;

public class InfoThreadChar extends Thread {
    private long sleep;
    private int threadId;
    private volatile boolean isTerminated;
    public  InfoThreadChar(int id, long sleep){
        this.threadId = id;
        this.sleep = sleep;
        this.isTerminated = false;
    }

    @Override
    public void run() {

    }

    public long getSleep() {return sleep;}

    public void terminateThreadEven() {
        this.isTerminated = true;
    }


}
