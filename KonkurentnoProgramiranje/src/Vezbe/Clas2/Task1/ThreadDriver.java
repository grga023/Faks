package Vezbe.Clas2.Task1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ThreadDriver extends Thread {

    private static InfoThreadEven evenThread(int maxCount, int id){
        InfoThreadEven thread = new InfoThreadEven(maxCount, id);
        return thread;
    }
    private static InfoThreadOdd oddThread(int maxCount, int id){
        InfoThreadOdd thread = new InfoThreadOdd(maxCount, id);
        return thread;
    }

    public static void main(String[] args) {

        System.out.println("Main started");
        System.out.println("-----------------------");

        Scanner keyboard = new Scanner(System.in);
        char key;

        InfoThreadEven thEven = evenThread(100,1);
        InfoThreadOdd thOdd = oddThread(100, 2);
        InfoThread th1 = new InfoThread(100, true, 3);
        InfoThread th2 = new InfoThread(100, false, 4);

        boolean isTerminatedLoop = false;



        while (!isTerminatedLoop){
            System.out.println("Insert: ");
            key = keyboard.next().charAt(0);
            switch (key){
                case 'b':
                    th1.start();
                    break;
                case 'p':
                    th1.terminateThread();
                    thOdd.terminateThread();
                    thEven = evenThread(100, 1);
                    thEven.start();
                    break;
                case'n':
                    thEven.terminateThreadEven();
                    thOdd = oddThread(100, 2);
                    thOdd.start();
                    break;
                case't':
                    thEven.terminateThreadEven();
                    thOdd.terminateThread();
                    break;
                case'?':
                    System.out.println("Odd counter: "+thEven.getCounter());
                    System.out.println("Even counter: "+thOdd.getCounter());
                    break;
                case 's':
                    th2.start();
                case 'e':
                    th2.terminateThread();
                    break;
                case '`':
                    isTerminatedLoop = true;
                    break;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("\n !!! Main thread terminated !!! ");
    }
}
