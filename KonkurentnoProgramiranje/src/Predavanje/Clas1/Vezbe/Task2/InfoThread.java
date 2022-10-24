package Predavanje.Clas1.Vezbe.Task2;

import javax.swing.plaf.TableHeaderUI;

public class InfoThread extends Thread{

    private int operations;
    public InfoThread(int operations){
        this.operations = operations;
    }

    public void run() {
        Thread th = Thread.currentThread();
        
        if(operations == 1){
            double n = 0;
                try {
                    for(int i = 1; i <= 100; i++) {
                        n = Math.sqrt(i);
                        System.out.println("Koren [" + i + "]-tog broja je: " + n);
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        } else if (operations ==2) {
            int n = 0;
            try {
                for (int i = 0; i <= 10; i++) {
                    n *= i;
                    Thread.sleep(200);
                }
                System.out.println("Faktoriel prvih 10 brojeva je: " + n);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else if (operations == 3) {
            double n = 0;
            try {
                for (int i = 1; i < 100; i++){
                    n = 1/(double)i;
                    System.out.println("Reciprocna vrednost broja "+i+ " je: "+n);
                    Thread.sleep(300);
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
