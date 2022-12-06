package Vezbe.Clas4.Task2;

public class ThreadCounter5 extends Thread{
    private int maxCount;
    private int counter;
    private int n;
    private  int counter5[];
    private volatile boolean suspended;
    private volatile boolean isTerminated = false;
    private int threadID = 0;

    public ThreadCounter5(int maxCount, int threadID){
        super();
        this.suspended = false;
        this.counter = 1;
        this.threadID = threadID;
        this.maxCount = maxCount;
        n = maxCount/2;
        counter5 = new int[maxCount];
        this.counter5 = createOddCounter();
    }

    public int[] createOddCounter(){
        n = 0;
        for(int i = 1; i <= maxCount; i++){
            if(i % 5 == 0){
                counter5[n] = i;
                n++;
            }
        }
        return counter5;
    }

    @Override
    public void run() {
        while (!isTerminated){
            System.out.println(" --- Thread[" + getThreadID() + "] started --- ");
            while (this.counter < this.maxCount){
                int m = 0;
                for(int i = 0; i<=n; i++){
                    if(isTerminated){
                        break;
                    }

                    try {
                        isSuspended();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (m < maxCount/2 ) {
                        System.out.println("[" + getThreadID() + "] " + counter5[i]);
                        m++;
                    }

                    this.counter = counter5[i];

                    if(i+1 == n) {
                        i = 0;
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                if(isTerminated){
                    break;
                }

            }

            System.out.println(" --- Thread[" + getThreadID() + "] terminated --- ");
        }

    }

    public void terminateThread(){
        isTerminated = true;
    }

    public int getThreadID(){return threadID;}

    public  int getCounter(){return counter;}

    private void isSuspended() throws InterruptedException {
        while (suspended){
            Thread.sleep(1000);
        }
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }
}
