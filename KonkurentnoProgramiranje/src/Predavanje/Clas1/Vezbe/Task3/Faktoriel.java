package Predavanje.Clas1.Vezbe.Task3;

public class Faktoriel extends Thread{
    @Override
    public void run() {
        int n = 1;
        try {
            for (int i = 1; i <= 10; i++) {
                n *= i;
                Thread.sleep(200);
            }
            System.out.println("Faktoriel prvih 10 brojeva je: " + n);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
