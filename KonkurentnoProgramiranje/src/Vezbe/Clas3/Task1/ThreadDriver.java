package Vezbe.Clas3.Task1;

public class ThreadDriver {
    public static void main(String[] args) {
        ThreadCounter tc = new ThreadCounter();
        ThreadString ts = new ThreadString();

        int inter1 = 17;
        int inter2 = 28;

        tc.start();
        ts.start();

        for(int i = 1; i <= 100; i++){
            System.out.println("Stole vole " +i);

            if(i == inter1){
                tc.interrupt();
                System.out.println("FIRST INTERRUPT");
            }
            if(i == inter2){
                ts.interrupt();
                System.out.println("SECOND INTERRUPT");
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}
