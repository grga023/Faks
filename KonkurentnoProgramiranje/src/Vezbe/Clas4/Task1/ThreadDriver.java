package Vezbe.Clas4.Task1;

import java.util.Scanner;

public class ThreadDriver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("----------------------Main started------------");
        boolean isTerminated = false;
        char key = 0;
        Scanner scanner = new Scanner(System.in);
        ThreadCounter tc = new ThreadCounter();
        tc.start();

        while (!isTerminated){
            System.out.println("Insert: \n");
            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    tc.setSuspended(true);
                    break;
                case 'r':
                    tc.setSuspended(false);
                    break;
                case'm':
                    tc.setCounter(1);
                    break;
                case 't':
                    tc.setTerminated();
                    isTerminated = true;
                    break;
            }
        }
        Thread.sleep(400);
        System.out.println("----------------------Main terminated------------");
    }
}
