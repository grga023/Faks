package Vezbe.Clas3.Task3;

public class ThreadDriver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----------------Main started------------");
        ThreadRandomList rl = new ThreadRandomList();
        rl.start();

        Thread.sleep(2000);
        System.out.println("-----------------Main terminated------------");
    }
}
