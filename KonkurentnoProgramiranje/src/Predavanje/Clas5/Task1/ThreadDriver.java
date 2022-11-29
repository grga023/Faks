package Predavanje.Clas5.Task1;

public class ThreadDriver {
	
	public static void main(String[] args) {
	    
		// creating one object 
        Shared s1 = new Shared(); 
        // creating second object 
        Shared s2 = new Shared(); 
  
        // creating first thread and starting it 
        Thread1 t1 = new Thread1(s1, s2); 
        t1.start(); 
  
        // creating second thread and starting it 
        Thread2 t2 = new Thread2(s1, s2); 
        t2.start();
  
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
	    	
	}
}
