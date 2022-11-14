package Vezbe.Clas2.Task3;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ThreadDriver extends Thread {

    private static InfoThreadChar charThread( int id, long sleep, char letter){
        InfoThreadChar thread = new InfoThreadChar( id, sleep, letter);
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
        sleep = keyboard.nextLong();
        System.out.println("Unesite karakter za thChar:");
        char letter = keyboard.next().charAt(0);
        InfoThreadChar thChar = charThread(1, sleep, letter);

        System.out.println("Unesite vrednost spavanja za thNum:");
        sleep = keyboard.nextLong();
        InfoThreadNum thNum = numThread( 2,sleep);

        boolean isTerminatedLoop = false;

        while (!isTerminatedLoop){
            System.out.println("Insert: ");
            key = keyboard.next().charAt(0);
            sleep = thChar.getSleep();
            int ascii = (int)(thChar.getLetter());
            switch (key){
                case 's':
                    thChar = charThread(1, sleep, letter);
                    thNum = numThread( 2,sleep);
                    thChar.start();
                    thNum.start();
                    break;
                case 'c':
                    thChar.isUpper();
                    break;
                case '?':
                    System.out.println("Char is " +(thChar.getStats() ? "upper case. " : "lover case. ") + thChar.getLetter()+ ", ASCII vrednos karaktera je: ["+ascii+"]");
                    break;
                case't':
                    thChar.terminateThreadEven();
                    thNum.terminateThread();
                    isTerminatedLoop = true;
                    break;
            }
            if(key == 't'){
                sleep = 0;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(sleep);
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
        System.out.println("\n !!! Main thread terminated !!! Char thread sleep time: " + thChar.getSleep());
    }
}
