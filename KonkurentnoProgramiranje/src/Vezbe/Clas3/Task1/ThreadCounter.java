package Vezbe.Clas3.Task1;

public class ThreadCounter extends Thread{
    private int counter;
    private int maxCount;

    public ThreadCounter(){
        maxCount = 50;
        counter = 1;
    }

    @Override
    public void run() {
        while (counter <= maxCount){
            System.out.println("Majmunee "+counter);
            counter++;
            if(counter == maxCount){
                counter = 1;
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
