package Predavanje.Clas2.Task1;

import java.util.Scanner;

public class InfoThread {
    public static void main(String[] args) {
        ParentThread pt = new ParentThread();
        DA da = new DA();

        System.out.println("Maain sarted");

        //pt.start();
        da.start();

//        Scanner keyboard = new Scanner(System.in);
//        char key;
//        System.out.println("Insert:");
//        key = keyboard.next().charAt(0);
//
//        switch (key){
//            case 't':
//             pt.isTerminated();
//            break;
//        }

        try {
            Thread.sleep(2000);
        }catch (Exception ex){

        }


        System.out.println("Main stopped");
    }
}
