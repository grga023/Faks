package Vezbe.Clas2.Task1;

public class InfoThreadOdd extends Thread{
    Thread th = Thread.currentThread();
    private int maxCount = 0;
    private int counter=1;
    private boolean isTerminated =false;
    public InfoThreadOdd(int maxCount){
        this.maxCount = maxCount;
        this.isTerminated = false;
    }

    @Override
    public void run() {
        System.out.println(" --- Thread[" + th.threadId() + "] started --- ");
        int n = 0;
        while (!isTerminated){
            if(counter % 2 == 1 || counter == 1){
                if(n<maxCount/2){
                    System.out.println("["+th.threadId()+"] "+counter);
                    n++;
                }
            }

            counter++;

            if(this.counter == this.maxCount) {
                this.counter = 0;
            }
        }
        System.out.println(" --- Thread[" + th.threadId() + "] terminated --- ");
    }

    public void terminateThreadOdd(){
        isTerminated = true;
    }
}
