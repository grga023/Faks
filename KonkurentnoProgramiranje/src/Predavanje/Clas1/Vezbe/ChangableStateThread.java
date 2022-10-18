package Predavanje.Clas1.Vezbe;

public class ChangableStateThread implements Runnable{
    public void run() {
        Thread thread = Thread.currentThread();

        try {
            System.out.println("[" + thread.getId() + "] " + "" + thread.getName() + "" + (thread.isDaemon() ? " Is deamon thread" : " Is user thread"));
            Thread.sleep(5000);
        }catch (Exception e){
            System.out.println("" + thread.getName() + " Is stopped");
        }
    }
}