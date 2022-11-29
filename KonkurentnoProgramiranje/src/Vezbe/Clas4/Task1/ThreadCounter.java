package Vezbe.Clas4.Task1;

public class ThreadCounter extends Thread{

    private volatile boolean suspended;
    private volatile boolean isTerminated;

    private int counter;

    private int maxCount;
    public ThreadCounter(){
        this.maxCount = 100;
        this.counter = 1;
        isTerminated = false;
        suspended = false;
    }
    @Override
    public void run() {
        System.out.println("----------------------Counter Started------------");
        while (!isTerminated) {
            for (int i = 0; i <= maxCount; i++) {
                try {
                    isSuspended();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Counter is: " + counter);
                counter++;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(isTerminated) break;
            }
        }

        System.out.println("----------------------Counter terminated------------");
    }

    private void isSuspended() throws InterruptedException {
        while (suspended){
            Thread.sleep(1000);
        }
    }

    public void setSuspended(boolean suspended) {
        this.suspended = suspended;
    }

    public void setTerminated(){
        this.isTerminated = true;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
