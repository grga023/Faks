package Vezbe.Clas1.Task3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ThreadDriver extends Thread {
    public static void main(String[] args) {
        System.out.println("\n !!! Main thread started !!! ");

        /* keybboard input */
        Scanner keyboard = new Scanner(System.in);
        char key;

        /* counter thread */
        InfoThread th1;
        th1 = new InfoThread(1,33, 0);
        InfoThread th2;
        th2 = new InfoThread(2,33,0);
        InfoThread th3;
        th3 = new InfoThread(3,33,0);

        boolean terminateAll = false;

        while(!terminateAll) {
            System.out.println("Insert: ");
            key = keyboard.next().charAt(0);
            switch(key) {
                case '1':
                    th1.start();
                    th2.start();
                    th3.start();
                    break;
                case '?':
                    /* print counter state */
                    System.out.println("Thread[" + th1.getThreadID() + "]=" + th1.getCounter());
                    System.out.println("Thread[" + th2.getThreadID() + "]=" + th2.getCounter());
                    System.out.println("Thread[" + th3.getThreadID() + "]=" + th3.getCounter());

                    System.out.println("Thread[" + th1.getThreadID() + "]=" + th1.getState());
                    System.out.println("Thread[" + th2.getThreadID() + "]=" + th2.getState());
                    System.out.println("Thread[" + th3.getThreadID() + "]=" + th3.getState());
                    break;
                case 't':
                    /* terminate all child threads */
                    th1.terminateThread();
                    th2.terminateThread();
                    th3.terminateThread();
                    /* terminate the main thread */

                    terminateAll = true;
                    break;
                case 'u':
                    th1.incrementing();
                    th2.incrementing();
                    th3.incrementing();
                    break;
                case 'd':
                    th1.decrementing();
                    th2.decrementing();
                    th3.decrementing();
                    break;
                default:
                    break;
            }

        }
        /* wait 2000ms to see all child threads are terminated */
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("\n !!! Main thread terminated !!! ");
    }
}
