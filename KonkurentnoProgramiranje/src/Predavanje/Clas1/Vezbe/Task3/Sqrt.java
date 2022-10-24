package Predavanje.Clas1.Vezbe.Task3;

public class Sqrt extends  Thread{
    @Override
    public void run() {
        double n = 0;
        try {
            for(int i = 1; i <= 100; i++) {
                n = Math.sqrt(i);
                System.out.println("Koren [" + i + "]-tog broja je: " + n);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
