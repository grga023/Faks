package Predavanje.Clas5.Task1;

public class ThreadUtil {

	// sleep a thread 
    public static void sleep(long millis)
    { 
        try { 
            Thread.sleep(millis); 
        } 
        catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
    } 
}
