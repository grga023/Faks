package Vezbe.Klk.prvi;


import java.util.Scanner;

public class ThDriver {
    public static void main(String[] args) throws InterruptedException {

        ThLetter tcL = new ThLetter();

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
                case 'b' -> tcL.start();

                case 'n' -> tcL.setSuspended(true);

                case 'r' -> tcL.setSuspended(false);

                case 'e' -> {
                    tcL.terminateThread();
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
