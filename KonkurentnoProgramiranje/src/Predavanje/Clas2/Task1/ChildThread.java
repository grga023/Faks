package Predavanje.Clas2.Task1;

public class ChildThread extends Thread{
    private volatile boolean isTerminated;
    private long sleep;

    public ChildThread(){
        isTerminated = false;
    }

    public ChildThread(long sleep){
        isTerminated = false;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        while (!isTerminated){
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void isTerminated(){
        this.isTerminated = true;
    }

    public void setSleep(long sleep){
        this.sleep = sleep;
    }

}
