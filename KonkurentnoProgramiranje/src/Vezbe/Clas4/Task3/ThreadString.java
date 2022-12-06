package Vezbe.Clas4.Task3;

public class ThreadString extends Thread{
    private volatile boolean suspended;
    private volatile boolean isTerminated;
    private int counter;

    private char randS;

    public ThreadString(){
        suspended = false;
        isTerminated = false;
    }

    @Override
    public void run() {
        System.out.println("Char started");
        while (!isTerminated){
            try {
                isSuspended();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            int min = 97;
            int max = 122;
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            randS = (char) random_int;

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Char stopped");
    }

    public char getRandS() {
        return randS;
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
            System.out.println("Thread string suspended!!!!!!!!");
        }
        else System.out.println("Tread string resumed!!!!!!!");
    }
    public boolean isSusoended(){return this.suspended;}
}
