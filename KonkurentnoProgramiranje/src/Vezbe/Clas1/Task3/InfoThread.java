package Vezbe.Clas1.Task3;

public class InfoThread extends Thread{
    /* thread identifier */
    private int threadID;
    /* internal counter */
    private int counter;
    private int i = 0;
    /* max count */
    private final int maxCount;
    private final int minCount;
    /* thread termination control */
    private volatile boolean bTerminateThread;
    private volatile boolean direction;



    public InfoThread(int threadID, int maxCounterValue, int minCounterValue) {
        super();
        this.threadID = threadID;
        this.counter = 0;
        this.maxCount = maxCounterValue;
        this.minCount = minCounterValue;
        this.bTerminateThread = false;
        this.direction = true;
    }

    public void run() {

        System.out.println(" +++ Thread[" + threadID + "] started +++ ");

        while(!bTerminateThread) {
            setI(0);
            while(this.counter < this.maxCount && direction) {
                /* check to see if thread should stop working */
                if(bTerminateThread) {
                    break;
                }

                if (i<maxCount) {
                    System.out.println("["+threadID+"] Count up: " + this.counter);
                    i++;
                }

                ++this.counter;

                if(this.counter == this.maxCount) {
                    this.counter = 0;
                }
            }
            while(this.counter > this.minCount && !direction) {
                /* check to see if thread should stop working */
                if(bTerminateThread) {
                    break;
                }

                if (i>minCount) {
                    System.out.println("["+threadID+"] Count down: " + this.counter);
                    i--;
                }

                --this.counter;

                if(this.counter == this.minCount) {
                    this.counter = maxCount;
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

    public int getMaxCount() {
        return maxCount;
    }

    private int getMinCount(){return minCount;}


    public void terminateThread(){
        bTerminateThread = true;
    }

    public void incrementing(){
        this.direction = true;
        this.counter = 0;
        setI(minCount);
    }

    public void decrementing(){
        this.direction = false;
        this.counter = maxCount;
        setI(maxCount);
    }

    private void setI(int n){
        this.i=n;
    }
}
