package Vezbe.Klk.Kolokvijum;

import Vezbe.Klk.prvi.ThLetter;

import java.util.Scanner;

public class ThreadDriver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main startedn");
        ThreadCounter tcC = new ThreadCounter();

        boolean isTerminated = false;
        char key;

        Scanner sc = new Scanner(System.in);
        System.out.println("To start insert s:");
        key = sc.next().charAt(0);
        isTerminated = key != 's';

        while (!isTerminated){
            System.out.println("Insert:");
            key = sc.next().charAt(0);

            switch (key) {
                case 'b' -> tcC.start();

                case 'n' -> tcC.setSuspended(true);

                case 'r' -> tcC.setSuspended(false);

                case 'e' -> {
                    tcC.terminateThread();
                    isTerminated = true;
                }

                default -> {
                }
            }
        }

        Thread.sleep(1000);

        System.out.println("---------Main terminated---------");
    }
}
