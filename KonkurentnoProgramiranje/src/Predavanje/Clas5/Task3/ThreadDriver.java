package Predavanje.Clas5.Task3;

import Predavanje.Clas5.Task1.ThreadUtil;

import java.util.concurrent.Semaphore;

public class ThreadDriver {
	
	public static void main(String[] args) {
	    
		System.out.println("---------------------------");
	    System.out.println("Thread main started");	    
	    
		// creating one shared object 
		SharedCounter sc = new SharedCounter(0);
		        
        // create a semaphore with 2 permits for protecting access to shared object
        int semaphorePermits = 2;

        Sjemafor sem = new Sjemafor(true);
       
        System.out.println("---------------------------");
	    System.out.println("Working threads started");
        
        WorkingThread wt1 = new WorkingThread(sc, "WT1", sem);
        WorkingThread wt2 = new WorkingThread(sc, "WT2", sem);
        WorkingThread wt3 = new WorkingThread(sc, "WT3", sem);
        wt1.start();
        wt2.start();
        wt3.start();
        
        // sleeping main thread 
        ThreadUtil.sleep(1000);
        
        System.out.println("---------------------------");
	    System.out.println("terminating working threads");
	    wt1.terminateThread(true);
	    wt2.terminateThread(true);
	    wt3.terminateThread(true);
	    
	    System.out.println("---------------------------");
	    System.out.println("Thread main terminated");	    	
	}
}
