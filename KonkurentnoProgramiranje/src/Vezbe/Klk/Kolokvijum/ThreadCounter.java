package Vezbe.Klk.Kolokvijum;

public class ThreadCounter extends Thread{
    private int counter;
    private int maxCount;
    private int c;
    private volatile boolean isTerminated;
    private volatile boolean suspended;


    public ThreadCounter(){
        maxCount = 100;
        counter = 1;
        c = 1;
        isTerminated = false;

    }

    @Override
    public void run() {
        System.out.println("Counter started");
        while (!isTerminated){

            try {
                counter(counter);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(isTerminated){
                break;
            }

        }
        System.out.println("Counter terminated");
    }

    private void counter(int counter) throws InterruptedException {
        for (int i = counter; i <= maxCount; i++){
            try {
                isSuspended();
            } catch (InterruptedException e) {
                return;
            }

            if(c %2 != 0) {
                counter = i;
                System.out.println("Counter is: "+ counter);
            }

            else{
                System.out.println("Changed direction!");
                counterBack(counter);
                break;
            }

            if(i == maxCount){
                i = 1;
            }

            if(isTerminated){
                break;
            }

            Thread.sleep(200);
        }
    }

    private void counterBack(int counter) throws InterruptedException {
        for (int i = counter; i > 0; i--) {

            try {
                isSuspended();
            } catch (InterruptedException e) {
                return;
            }

            if(c %2 != 0 ){
                counter(counter);
                break;
            }

            counter = i;
            System.out.println("Counter is: "+ counter);

            if (i == 1) {
                i = 100;
            }

            if (isTerminated) {
                break;
            }
            Thread.sleep(200);
        }
    }

    public void setSuspended ( boolean suspended){

        this.suspended = suspended;
        if (this.suspended) {
            System.out.println("Thread counter suspended!!!!!!!!");
        } else System.out.println("Tread counter resumed!!!!!!!");
    }

    private void isSuspended() throws InterruptedException {
        if(suspended) c++;
        while (suspended){
            Thread.sleep(1000);
        }
    }

    public void terminateThread () {
        isTerminated = true;
    }
}
