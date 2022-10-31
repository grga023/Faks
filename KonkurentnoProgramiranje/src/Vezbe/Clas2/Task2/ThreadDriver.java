package Vezbe.Clas2.Task2;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ThreadDriver extends Thread {

    private static InfoThreadEven evenThread(int maxCount, int id, long sleep){
        InfoThreadEven thread = new InfoThreadEven(maxCount, id, sleep);
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

        InfoThreadEven thEven = evenThread(100,1, 50);
        InfoThreadOdd thOdd = oddThread(100, 2);
//        InfoThread th1 = new InfoThread(100, true, 3);
//        InfoThread th2 = new InfoThread(100, false, 4);

        boolean isTerminatedLoop = false;



        while (!isTerminatedLoop){
            System.out.println("Insert: ");
            key = keyboard.next().charAt(0);
            long sleep = thEven.getSleep();
            switch (key){
                case 'b':
                    thEven.start();
                    thOdd.start();
                    break;

                case '+':
                    sleep += 100;
                    thEven.terminateThreadEven();
                    thEven = evenThread(100, 1 , sleep);
                    thEven.start();
                    break;
                case '-':
                    sleep -= 30;
                    thEven.terminateThreadEven();
                    thEven = evenThread(100, 1 , sleep);
                    thEven.start();
                    break;
                case't':
                    thEven.terminateThreadEven();
                    thOdd.terminateThread();
                    isTerminatedLoop = true;
                    break;
                case'?':
                    System.out.println("Odd counter: "+thOdd.getCounter());
                    System.out.println("Even counter: "+thOdd.getCounter());
                    break;
            }
            if(key == 't'){
                sleep = 0;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(sleep*63);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("\n !!! Main thread terminated !!! Even thread sleep time: " + thEven.getSleep());
    }
}
