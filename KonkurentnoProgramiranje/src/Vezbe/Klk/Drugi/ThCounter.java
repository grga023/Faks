package Vezbe.Klk.Drugi;

public class ThCounter extends Thread{
    private int counter;
    private int maxCount;
    private int c;
    private volatile boolean isTerminated;
    private volatile boolean suspended;


    public ThCounter(){
        maxCount = 100;
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
        for (int i = 1; i <= maxCount; i++){
            try {
                isSuspended();
            } catch (InterruptedException e) {
                return;
            }

            if(c %2 != 0) {
                if(i %2 == 0){
                    counter = i;
                    System.out.println("Counter is: "+ counter);
                }
            }

            else{
                if(i %2 != 0){
                    counter = i;
                    System.out.println("Counter is: "+ counter);
                }
            }


            // 99 je mesto 100 da ne bi  upadao u petlju 100 kada naidje parni brojac
            if(counter == 99){
                System.out.println("2 seconds break!");
                Thread.sleep(2000);
                System.out.println("Changed direction!");
                counter100();
                break;
            }

            if(i == maxCount){
                i = 1;
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

            if (i % 2 != 0) {
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
