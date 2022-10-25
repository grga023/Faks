package Vezbe.Clas2.Task1;

public class InfoThreadEven extends Thread{
    private int maxCount = 0;
    public  int threadId;
    private  int counterEven[];
    private int n;
    private int counter = 1;
    public volatile boolean isTerminated;

    public InfoThreadEven(int maxCount, int threadId){
        super();
        this.threadId = threadId;
        this.maxCount = maxCount;
        this.isTerminated = false;
        counterEven = new int[maxCount];
        n =0;
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
        System.out.println(" --- Thread[" + getThreadId() + "] started --- ");

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
            }
            if(isTerminated){
                break;
            }
        }
        System.out.println(" --- Thread[" + getThreadId() + "] terminated --- ");
    }

    public void terminateThreadEven(){
        this.isTerminated = true;
    }

    public void setThreadId(int threadId){
        this.threadId = threadId;
    }

    public int getThreadId(){return threadId;}
}
