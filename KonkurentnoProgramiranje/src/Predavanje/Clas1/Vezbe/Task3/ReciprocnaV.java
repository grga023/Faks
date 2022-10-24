package Predavanje.Clas1.Vezbe.Task3;

public class ReciprocnaV extends Thread{
    @Override
    public void run() {
        double n = 0;
        try {
            for (int i = 1; i < 100; i++){
                n = 1/(double)i;
                System.out.println("Reciprocna vrednost broja "+i+ " je: "+n);
                Thread.sleep(300);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
