package Vezbe.Clas2.Task2;

public class InfoThreadEven extends Thread{
    private int maxCount = 0;
    public  int threadId;
    private int[] counterEven;
    private int n;
    private int counter = 0;
    private final long sleep;
    public volatile boolean isTerminated;

    public InfoThreadEven(int maxCount, int threadId, long sleep){
        super();
        this.sleep = sleep;
        this.threadId = threadId;
        this.maxCount = maxCount;
        this.isTerminated = false;
        counterEven = new int[maxCount];
        n = 0;
        counterEven = createEvenCounter();
    }

    public int[] createEvenCounter(){
        n = 0;
        for(int i = 1; i <= maxCount; i++){
            if(i % 2 == 0){
                counterEven[n] = i;
                n++;
            }
        }
        return counterEven;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(this.sleep);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(" --- Thread[" + getThreadId() + "] started ---. Sleepe timer is: "+getSleep());

        while (!isTerminated){
            int m = 0;
            for(int i = 0; i<=n; i++){
                if(isTerminated){
                    break;
                }

                if (m < maxCount/2 ) {
                    System.out.println("[" + getThreadId() + "] " + counterEven[i]);
                    m++;
                }

                this.counter = counterEven[i];

                if(i+1 == n) {
                    i = 0;
                }

                try {
                    Thread.sleep(this.sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(isTerminated){
                break;
            }
        }
        System.out.println(" --- Thread[" + getThreadId() + "] terminated ---. Sleep time was: " +getSleep());
    }

    public void terminateThreadEven(){
        this.isTerminated = true;
    }

    public void setThreadId(int threadId){
        this.threadId = threadId;
    }

    public long getSleep(){return sleep;}
    public int getThreadId(){return threadId;}
}
