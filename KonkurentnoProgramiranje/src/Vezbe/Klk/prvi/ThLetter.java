package Vezbe.Klk.prvi;

public class ThLetter extends Thread{
    private volatile boolean suspended;
    private volatile boolean isTerminated;
    private int counter;
    private char letter;

    public ThLetter(){
        suspended = false;
        counter = 1;
        isTerminated = false;
    }

    @Override
    public void run() {
        System.out.println("Char started");
        while (!isTerminated){



            for (int i = 65; i <= 90; i++) {

                try {
                    isSuspended();
                } catch (InterruptedException e) {
                    return;
                }

                letter = (char) i;

                if(counter%2 != 0)
                    letter = toUpper(letter);
                else
                    letter = toLower(letter);

                System.out.println("Letter is: " + letter);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    return;
                }

                if(isTerminated){
                    break;
                }
            }

            if(isTerminated){
                break;
            }

        }
        System.out.println("Char stopped");
    }

    private void isSuspended() throws InterruptedException {
        if(suspended) counter++;
        while (suspended){
            Thread.sleep(1000);
        }
    }
    public void terminateThread(){
        isTerminated = true;
    }

    private char toUpper(char a){
        String n = String.valueOf(a).toUpperCase();
        a = n.charAt(0);
        return a;
    }

    private char toLower(char a){
        String n = String.valueOf(a).toLowerCase();
        a = n.charAt(0);
        return a;
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
