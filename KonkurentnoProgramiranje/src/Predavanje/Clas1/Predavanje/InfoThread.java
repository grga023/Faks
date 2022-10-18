public class InfoThread implements Runnable {
	
	public void run() {
		Thread th = Thread.currentThread();
		System.out.println("[" + th.getId() + "] " + th.getName() + " is started");
		System.out.println("[" + th.getId() + "] " + (th.isDaemon() ? "Deamon" : "None deamon"));
		//System.out.println("[" + th.getId() + "] " + th.getState());
		try {
			//System.out.println("[" + th.getId() + "] sleeps for 5000ms");
			int counter  = 7;
			if(th.isDaemon()) {
				counter = 10;
			}
			
			for(int i=0; i<counter; ++i) {
				System.out.println("[" + th.getId() + "] = " + i);
				Thread.sleep(1000);
			}
		} catch (Exception ex) {
		}	

		System.out.println("[" + th.getId() + "] " + th.getName() + " is terminated");
	}
}
