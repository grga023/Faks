package Predavanje.Clas1.Vezbe.Task3;

import Predavanje.Clas1.Vezbe.Task2.InfoThread;

import java.util.Scanner;

public class ThreadDriver {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started!");
        System.out.println("--------------------");
        System.out.println();

        Thread th1 = new Thread(new Sqrt(), "sqrt");
        Thread th2 = new Thread(new Faktoriel(), "Faktoriel");
        Thread th3 = new Thread(new ReciprocnaV(), "ReciprocnaVrednost");

        boolean thTerminated = false;

        while (!thTerminated){
            System.out.println("Insert: ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input){
                case "s":
                    th1.start();
                    break;
                case "f":
                    th2.start();
                    break;
                case "r":
                    th3.start();
                case "1":
                    th1.setDaemon(true);
                    th3.setDaemon(true);
                    th3.setDaemon(true);
                    break;
                case "2":
                    th1.setDaemon(false);
                    th3.setDaemon(false);
                    th3.setDaemon(false);
                case  "0":
                    System.out.println("Thread[" + th1.threadId()+ "]=" + th1.getState());
                    System.out.println("Thread[" + th2.threadId() + "]=" + th2.getState());
                    System.out.println("Thread[" + th3.threadId() + "]=" + th3.getState());
                    break;
                case "t":
                    thTerminated = true;
                    break;
            }
        }



        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println("--------------------");
        System.out.println(Thread.currentThread().getName() + " terminates!");
        System.out.println();
    }
}
