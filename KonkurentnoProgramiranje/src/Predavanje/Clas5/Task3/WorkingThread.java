package Predavanje.Clas5.Task3;//import java.util.concurrent.Sjemafor;

import Predavanje.Clas5.Task1.ThreadUtil;

public class WorkingThread extends Thread {

	private SharedCounter sc; 
	private Sjemafor sem;
	private volatile boolean bTerminate = false;
  
    // constructor to initialize fields 
    public WorkingThread(SharedCounter s1, String threadName, Sjemafor sem) { 
        this.setSc(s1);
        this.setSem(sem);
        this.setName(threadName);
    }
    
  
    // run method to start a thread 
    @Override
    public void run() { 
    	System.out.println(this.getName() + " started");
    	while(!this.isbTerminate()) {
    		try {
    			System.out.println(this.getName() + " is waiting permision for shared object");
				this.getSem().permit();
				// get permission to access shared object / increment
				System.out.println(this.getName() + " gets a permit"); 
				this.getSc().increment();
				System.out.println(this.getName() + " incremented counter:: " + this.getSc().getCount());
				ThreadUtil.sleep(200);
				// release Sjemafor
				this.getSem().odpusti();
				System.out.println(this.getName() + " released permision for shared object");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    	System.out.println(this.getName() + " terminated");
    }
    
    public void terminateThread(boolean bExit) {
    	this.setbTerminate(bExit);
    }

	/**
	 * @return the sc
	 */
	public SharedCounter getSc() {
		return sc;
	}

	/**
	 * @param sc the sc to set
	 */
	public void setSc(SharedCounter s1) {
		this.sc = s1;
	}

	/**
	 * @return the sem
	 */
	public Sjemafor getSem() {
		return sem;
	}

	/**
	 * @param sem the sem to set
	 */
	public void setSem(Sjemafor sem) {
		this.sem = sem;
	}


	/**
	 * @return the bTerminate
	 */
	public boolean isbTerminate() {
		return bTerminate;
	}


	/**
	 * @param bTerminate the bTerminate to set
	 */
	public void setbTerminate(boolean bTerminate) {
		this.bTerminate = bTerminate;
	} 
    
    
}
