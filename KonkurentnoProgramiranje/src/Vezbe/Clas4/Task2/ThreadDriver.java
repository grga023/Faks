package Vezbe.Clas4.Task2;

import java.util.Scanner;

public class ThreadDriver {
    public static void main(String[] args) throws InterruptedException {
        ThreadCounter3 tc3 = new ThreadCounter3(200, 1);
        ThreadCounter5 tc5 = new ThreadCounter5(200, 2);
        boolean isTerminatted = false;
        char key;

        Scanner scanner = new Scanner(System.in);



        while (!isTerminatted){
            System.out.println("Insert: ");
            key  = scanner.next().charAt(0);

            switch (key) {
                case '3' -> {
                    tc3.start();
                }
                case '5' -> tc5.start();
            }

            if(tc3.isAlive() && tc5.isAlive()){
                isTerminatted = true;
            }
        }

        suspendResume(tc3, tc5);

        do {
            Thread.sleep(700);
        }while (tc3.isAlive() && tc5.isAlive());
        System.out.println("---------Main terminated---------");
    }

    private static void suspendResume(ThreadCounter3 tc3, ThreadCounter5 tc5) throws InterruptedException {
        if(tc3.isAlive() && tc5.isAlive()) {
            boolean prom = true;
            do {
                int kaunter = tc3.getCounter();

                int sum = 0;
                do {
                    int modul = kaunter % 10;
                    sum += modul;
                    kaunter = kaunter / 10;
                } while (kaunter != 0);

                if (sum > 14) {
                    System.out.println("Zaustavljeno");
                    tc3.setSuspended(true);
                    tc5.setSuspended(true);
                    Thread.sleep(4000);
                    tc5.setSuspended(false);
                    prom = false;
                }
            } while (prom);
            Thread.sleep(4000);
            System.out.println("Zavrseno");
            tc3.interrupt();
            //tc3.setSuspended(false);
            tc5.terminateThread();
        }
    }
}
