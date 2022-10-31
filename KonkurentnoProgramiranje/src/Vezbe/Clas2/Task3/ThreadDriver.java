package Vezbe.Clas2.Task3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ThreadDriver extends Thread {

    private static InfoThreadChar charThread( int id, long sleep){
        InfoThreadChar thread = new InfoThreadChar( id, sleep);
        return thread;
    }
    private static InfoThreadNum numThread(int id,long sleep){
        InfoThreadNum thread = new InfoThreadNum(id, sleep);
        return thread;
    }

    public static void main(String[] args) {

        System.out.println("Main started");
        System.out.println("-----------------------");

        Scanner keyboard = new Scanner(System.in);
        char key;
        long sleep;

        System.out.println("Unesite vrednost spavanja za thChar:");
        sleep = keyboard.next().charAt(0);
        InfoThreadChar thChar = charThread(1, sleep);

        System.out.println("Unesite vrednost spavanja za thNum:");
        sleep = keyboard.next().charAt(0);
        InfoThreadNum thNum = numThread( 2,sleep);

        boolean isTerminatedLoop = false;

        while (!isTerminatedLoop){
            System.out.println("Insert: ");
            key = keyboard.next().charAt(0);
            sleep = thChar.getSleep();
            switch (key){
                case 'b':
                    thChar.start();
                    thNum.start();
                    break;

                case '+':
                    sleep += 100;
                    thChar.terminateThreadEven();
                    thChar = charThread( 1 , sleep);
                    thChar.start();
                    break;
                case '-':
                    sleep -= 30;
                    thChar.terminateThreadEven();
                    thChar = charThread(1 , sleep);
                    thChar.start();
                    break;
                case't':
                    thChar.terminateThreadEven();
                    thNum.terminateThread();
                    isTerminatedLoop = true;
                    break;
                case'?':
                    System.out.println("Odd counter: "+thChar);
                    System.out.println("Even counter: "+thNum);
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
        System.out.println("\n !!! Main thread terminated !!! Even thread sleep time: " + thChar.getSleep());
    }
}
