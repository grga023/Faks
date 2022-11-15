package Vezbe.Clas3.Task1;

public class ThreadString extends Thread {

    private String msg;

    public ThreadString(){
        msg = "Stjaneee";
    }

    @Override
    public void run() {
        while (true){
            System.out.println(msg);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
