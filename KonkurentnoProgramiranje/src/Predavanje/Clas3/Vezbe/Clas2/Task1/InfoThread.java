package Predavanje.Clas3.Vezbe.Clas2.Task1;

public class InfoThread extends Thread{
    private volatile boolean isTerminated = false;
    private int counter = 0;
    private boolean isCounter = true;
    private int maxCounter = 0;
    private int threadID = 0;

    public InfoThread(int maxCounter, boolean isCounter, int threadID){
        super();
        this.threadID = threadID;
        this.maxCounter = maxCounter;
        this.isCounter = isCounter;
    }

    public void terminateThread(){
        isTerminated = true;
    }

    private int getThreadID(){return threadID;}

    @Override
    public void run(){
        int n = 0;
        while (!isTerminated){
            System.out.println(" --- Thread[" + getThreadID() + "] started --- ");
            while ( !isCounter){
                if(isTerminated){
                    break;
                }
                if(n<=counter) {
                    System.out.println(+getThreadID()+" String: ");
                    n++;
                }
                counter++;

                if(this.counter == this.maxCounter) {
                    this.counter = 0;
                }
            }

            while (isCounter){
                if(isTerminated){
                    break;
                }
                if(n<=counter) {
                    System.out.println(+getThreadID()+" Counter is: " + counter);
                    n++;
                }
                counter++;

                if(this.counter == this.maxCounter) {
                    this.counter = 0;
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" --- Thread[" + getThreadID() + "] terminated --- ");

        }
    }
}
