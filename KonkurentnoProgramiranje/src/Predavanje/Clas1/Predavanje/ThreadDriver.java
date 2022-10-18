public class ThreadDriver {
	public static void main(String[] args){
		
		System.out.println(Thread.currentThread().getName() + " started!");
		System.out.println("--------------------");
		System.out.println();
		
		// create two threads
		Thread th1 = new Thread(new InfoThread(), "Thread number one");
		Thread th2 = new Thread(new InfoThread(), "Thread number two");
		
		// check thread state
		System.out.println(th1.getState());
		System.out.println(th2.getState());
		
		th1.setDaemon(true);
		th1.start();
		
		th2.setDaemon(false);
		th2.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("--------------------");
		System.out.println(Thread.currentThread().getName() + " terminates!");
		System.out.println();
	}
}


