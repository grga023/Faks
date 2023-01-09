package Vezbe.Klk.prvi;


import java.util.Scanner;

public class ThDriver {
    public static void main(String[] args) {

        ThLetter tcL = new ThLetter();

        boolean isTerminated = false;
        char key;

        Scanner sc = new Scanner(System.in);

        while (!isTerminated){
            System.out.println("Insert:");
            key = sc.next().charAt(0);

            switch (key){
                case 'b':
                        tcL.start();
                    break;
                case 'n':
                    tcL.setSuspended(true);
                    break;
                case  'r':
                    tcL.setSuspended(false);
                    break;
                case 'e':
                    isTerminated = true;
                default: break;
            }
        }

        System.out.println("---------Main terminated---------");
    }
}
