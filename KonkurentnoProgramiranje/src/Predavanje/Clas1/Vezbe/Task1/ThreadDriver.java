package Predavanje.Clas1.Vezbe.Task1;
import java.util.Scanner;

public class ThreadDriver {

    public static Thread createTh(){
        Thread th = new Thread(new ChangableStateThread(), "ChangableTh");
        return th;
    }
    public static void main(String[] args){



        System.out.println(Thread.currentThread().getName() + " started!");
        System.out.println("--------------------");
        System.out.println();

        // create two threads

        // check thread state
        Thread th = createTh();
        int counter = 1;
        boolean isTerminated = false;

        while (!isTerminated) {

            if(counter<1){
                th = createTh();
                counter = 1;
            }
                System.out.println("Insert: ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();

                switch (input) {
                    case "s":
                        th.start();
                        counter--;
                        break;
                    case "e":
                        th.interrupt();
                        break;
                    case "u":
                        th.setDaemon(false);
                        System.out.println("[" + th.getId() + "] " + "" + th.getName() + "" + (th.isDaemon() ? " Is deamon thread" : " Is user thread"));
                        break;
                    case "d":
                        th.setDaemon(true);
                        System.out.println("[" + th.getId() + "] " + "" + th.getName() + "" + (th.isDaemon() ? " Is deamon thread" : " Is user thread"));
                        break;
                    case "t":
                        isTerminated = true;
                        break;
                }
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println("--------------------");
        System.out.println(Thread.currentThread().getName() + " terminates!");
        System.out.println();
    }
}
