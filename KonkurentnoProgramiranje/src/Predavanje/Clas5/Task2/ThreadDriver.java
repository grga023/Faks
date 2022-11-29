package Predavanje.Clas5.Task2;
import Predavanje.Clas5.Task1.ThreadUtil;

public class ThreadDriver {
    public static void main(String[] args) {
        // creating one object
        ShareResource r1 = new ShareResource();
        // creating second object
        ShareResource r2 = new ShareResource();

        ShareResource r3 = new ShareResource();

        // creating first thread and starting it
        Thread1 t1 = new Thread1(r1, r2, r3);
        t1.start();

        // creating second thread and starting it
        Thread2 t2 = new Thread2(r1, r2, r3);
        t2.start();

        Thread3 t3 = new Thread3(r1, r2, r3);
        t3.start();

        // sleeping main thread
        ThreadUtil.sleep(2000);

        System.out.println("---------------------------");
        System.out.println("Thread main terminated");
        if(t1.isAlive()) {
            System.out.println("t1 - is still working");
        } else {
            System.out.println("t1 - terminated");
        }

        if(t2.isAlive()) {
            System.out.println("t2 - is still working");
        } else {
            System.out.println("t2 - terminated");
        }

        if(t3.isAlive()) {
            System.out.println("t3 - is still working");
        } else {
            System.out.println("t3 - terminated");
        }
    }
}
