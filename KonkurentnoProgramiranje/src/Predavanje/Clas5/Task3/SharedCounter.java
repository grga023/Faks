package Predavanje.Clas5.Task3;

public class SharedCounter {

	private int count;
	
	public SharedCounter(int count) {
		super();
		this.count = count;
	}

	// synchronized increment method 
    void increment() 
    { 
    	int temp;
    	temp = this.count;
    	temp++;
    	this.count = temp;
    }
    
    // synchronized decrement method 
    void decrement() 
    { 
    	int temp;
    	temp = this.count;
    	temp--;
    	this.count = temp;
    }

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
    
    
}
