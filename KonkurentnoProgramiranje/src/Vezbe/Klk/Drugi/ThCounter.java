package Vezbe.Klk.Drugi;

public class ThCounter extends Thread{
    private int counter;
    private int maxCount;
    private int c;
    private volatile boolean isTerminated;
    private volatile boolean suspended;


    public ThCounter(){
        maxCount = 200;
        counter = 0;
        c = 1;
        isTerminated = false;

    }

    @Override
    public void run() {
        System.out.println("Counter started");
        while (!isTerminated){

            try {
                counter();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(isTerminated){
                break;
            }

        }
        System.out.println("Counter terminated");
    }

    private void counter() throws InterruptedException {
        for (int i = 0; i <= maxCount; i++){
            try {
                isSuspended();
            } catch (InterruptedException e) {
                return;
            }

            if(c %2 != 0) {
                if(i %3 == 0){
                    counter = i;
                    System.out.println("Counter is: "+ counter);
                }
            }

            else{
                if(i %5 == 0){
                    counter = i;
                    System.out.println("Counter is: "+ counter);
                }
            }

            if(counter == 100){
                System.out.println("2 seconds break!");
                Thread.sleep(2000);
                System.out.println("Changed direction!");
                counter100();
                break;
            }

            if(i == maxCount){
                i = 0;
            }

            if(isTerminated){
                break;
            }
            Thread.sleep(100);
        }
    }

    private void counter100() throws InterruptedException {
        for (int i = 100; i > 0; i--) {

            try {
                isSuspended();
            } catch (InterruptedException e) {
                return;
            }
            if(c %2 != 0 ){
                break;
            }

            if (i % 5 == 0) {
                counter = i;
                System.out.println("Counter is: "+ counter);
            }
            if (i == 1) {
                i = 100;
            }

            if (isTerminated) {
                break;
            }
            Thread.sleep(100);
        }
    }

        public void setSuspended ( boolean suspended){

            this.suspended = suspended;
            if (this.suspended) {
                System.out.println("Thread string suspended!!!!!!!!");
            } else System.out.println("Tread string resumed!!!!!!!");
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
