package Vezbe.Clas2.Task2;

public class InfoThreadOdd extends Thread{
    private int maxCount;
    private int counter;
    private int n;
    private  int counterOdd[];

    private volatile boolean isTerminated = false;
    private int threadID = 0;

    public InfoThreadOdd(int maxCount, int threadID){
        super();
        this.counter = 1;
        this.threadID = threadID;
        this.maxCount = maxCount;
        n = maxCount/2;
        counterOdd = new int[maxCount];
        this.counterOdd = createOddCounter();
    }

    public int[] createOddCounter(){
        n = 0;
        for(int i = 1; i <= maxCount; i++){
            if(i % 2 == 1){
                counterOdd[n] = i;
                n++;
            }
        }
        return counterOdd;
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

                    if (m < maxCount/2 ) {
                        System.out.println("[" + getThreadID() + "] " + counterOdd[i]);
                        m++;
                    }

                    this.counter = counterOdd[i];

                    if(i+1 == n) {
                        i = 0;
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
}
