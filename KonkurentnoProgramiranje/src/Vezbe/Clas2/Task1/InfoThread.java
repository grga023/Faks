package Vezbe.Clas2.Task1;

public class InfoThread extends Thread{
    Thread th = Thread.currentThread();
    private boolean isTerminated = false;
    private int counter = 0;
    private boolean isCounter = true;
    private int maxCounter = 0;

    public InfoThread(int maxCounter, boolean isCounter){
        this.maxCounter = maxCounter;
        this.isCounter = isCounter;
    }

    @Override
    public void run(){
        int n = 0;
        while (!isTerminated){
            System.out.println(" --- Thread[" + th.threadId() + "] started --- ");
            while ( !isCounter){
                if(n<=counter) {
                    System.out.println(+th.threadId()+" String: ");
                    n++;
                }
                counter++;

                if(this.counter == this.maxCounter) {
                    this.counter = 0;
                }
            }
            System.out.println(" --- Thread[" + th.threadId() + "] terminated --- ");
            System.out.println(" --- Thread[" + th.threadId() + "] started --- ");
            while (isCounter){
                if(n<=counter) {
                    System.out.println(+th.threadId()+" Counter is: " + counter);
                    n++;
                }
                counter++;

                if(this.counter == this.maxCounter) {
                    this.counter = 0;
                }
            }
            System.out.println(" --- Thread[" + th.threadId() + "] terminated --- ");
        }
    }
}
