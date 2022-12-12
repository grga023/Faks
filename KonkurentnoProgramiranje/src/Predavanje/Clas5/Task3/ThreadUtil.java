
public class ThreadUtil {

	// sleep a thread 
    static void sleep(long millis) 
    { 
        try { 
            Thread.sleep(millis); 
        } 
        catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
    } 
}
