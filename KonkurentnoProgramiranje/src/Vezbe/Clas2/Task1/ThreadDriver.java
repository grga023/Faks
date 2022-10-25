package Vezbe.Clas2.Task1;

import java.util.Scanner;

public class ThreadDriver {

    private static Thread evenThread(int maxCount){
        Thread thread = new Thread(new InfoThreadEven(maxCount),"EvenTh");
        return thread;
    }
    private static Thread oddThread(int maxCount){
        Thread thread = new Thread(new InfoThreadOdd(maxCount),"OddTh");
        return thread;
    }

    public static void main(String[] args) {

        System.out.println("Main started");
        System.out.println("-----------------------");

        Scanner keyboard = new Scanner(System.in);
        char key;

        Thread thEven = evenThread(100);
        Thread thOdd = oddThread(100);
        Thread th1 = new Thread(new InfoThread(100, true), "ClasicTh");
        Thread th2 = new Thread(new InfoThread(100, false), "StringTh");

        boolean isTerminated = false;

        int thE = 1;
        int thO = 1;
        while (!isTerminated){
            if(thE<1){
                thEven = evenThread(100);
                thE++;
            }
            if(thO<1){
                thOdd = oddThread(100);
                thO++;
            }


            System.out.println("Insert: ");
            key = keyboard.next().charAt(0);
            switch (key){
                case 'b':
                    th1.start();
                    break;
                case 'p':
                    th1.interrupt();
                    thEven.start();
                    thOdd.interrupt();
                    thO = 0;
                    thE = 0;
                    break;
                case'n':
                    thEven.interrupt();
                    thOdd.start();
                    thE = 0;
                    thO = 0;
                    break;
                case't':
                    thEven.interrupt();
                    thOdd.interrupt();
                    thO = 0;
                    thE = 0;
                    break;
                case's':
                    th2.start();
                    break;
                case 'e':
                    th2.interrupt();
                    break;
                case '`':
                    isTerminated = true;
                    break;
            }
        }

        System.out.println("Main stopped");
        System.out.println("---------------------");
    }
}
