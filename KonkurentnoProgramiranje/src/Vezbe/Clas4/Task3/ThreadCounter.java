package Vezbe.Clas4.Task3;

public class ThreadCounter extends Thread{
    private volatile boolean suspended;
    private volatile boolean isTerminated;

    private int counter;

    public ThreadCounter(){
        suspended = false;
        isTerminated = false;
        counter = 200;
    }

    @Override
    public void run() {
        System.out.println("Counter started");
        int i = 0;
        while (!isTerminated && i < counter){
            try {
                isSuspended();
            } catch (InterruptedException e) {
                return;
            }

            i++;
            if(i == counter){
                i = 0;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.println("Counter stopped");
    }

    private void isSuspended() throws InterruptedException {
        while (suspended){
            Thread.sleep(1000);
        }
    }

    public void terminateThread(){
        isTerminated = true;
    }

    public void setSuspended(boolean suspended) {

        this.suspended = suspended;
        if(this.suspended){
            System.out.println("Thread counter suspended!!!!!!!!");
        }
        else System.out.println("Tread counter resumed!!!!!!!");
    }
    public boolean isSusoended(){return this.suspended;}

    public int getCounter() {
        return counter;
    }
}
