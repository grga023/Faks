package Predavanje.Clas3.Vezbe.Clas1.Task2;

public class InfoThread extends Thread{
    /* thread identifier */
    private int threadID;
    /* internal counter */
    private int counter;
    /* max count */
    private int maxCount;
    /* thread termination control */
    private volatile boolean bTerminateThread;



    public InfoThread(int threadID, int maxCounterValue) {
        super();
        this.threadID = threadID;
        this.counter = 0;
        this.maxCount = maxCounterValue;
        this.bTerminateThread = false;
    }

    /**
     * Thread code goes here
     */
    public void run() {

        System.out.println(" +++ Thread[" + threadID + "] started +++ ");

        while(!bTerminateThread) {
            while(this.counter < this.maxCount) {
                /* check to see if thread should stop working */
                if(bTerminateThread) {
                    break;
                }
                ++this.counter;
                if(this.counter == this.maxCount) {
                    this.counter = 0;
                }
            }
        }
        System.out.println(" --- Thread[" + threadID + "] terminated --- ");
    }

    public int getThreadID() {
        return threadID;
    }

    public void setThreadID(int threadID) {
        this.threadID = threadID;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     * @return the maxCount
     */
    public int getMaxCount() {
        return maxCount;
    }

    /**
     * @param maxCount the maxCount to set
     */
    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public void terminateThread(){
        bTerminateThread = true;
    }
}
