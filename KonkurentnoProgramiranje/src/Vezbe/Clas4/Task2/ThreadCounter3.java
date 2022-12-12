package Vezbe.Clas4.Task2;

public class ThreadCounter3 extends Thread{
    private int maxCount;
    private int counter;
    private int n;
    private  int counter3[];
    private volatile boolean suspended;
    private volatile boolean isTerminated = false;
    private int threadID = 0;

    public ThreadCounter3(int maxCount, int threadID){
        super();
        this.suspended = false;
        this.counter = 1;
        this.threadID = threadID;
        this.maxCount = maxCount;
        n = maxCount/2;
        counter3 = new int[maxCount];
        this.counter3 = createOddCounter();
    }

    public int[] createOddCounter(){
        n = 0;
        for(int i = 1; i <= maxCount; i++){
            if(i % 3 == 0){
                counter3[n] = i;
                n++;
            }
        }
        return counter3;
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
                        System.out.println(" --- Thread[" + getThreadID() + "] terminated --- ");
                        return;
                    }

                    if (m < maxCount/2 ) {
                       System.out.println("[" + getThreadID() + "] " + counter3[i]);
                        m++;
                    }

                    this.counter = counter3[i];

                    if(i+1 == n) {
                        i = 0;
                    }

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        System.out.println(" --- Thread[" + getThreadID() + "] terminated --- ");
                        return;
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
        if(this.suspended){
            System.out.println("Thread counter3 suspended!!!!!!!!");
        }
        else System.out.println("Thread counter3 resumed!!!!!!!");
    }
}
