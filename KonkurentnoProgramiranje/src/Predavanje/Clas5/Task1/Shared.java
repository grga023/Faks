package Predavanje.Clas5.Task1;

public class Shared {

    private volatile boolean variable;
	// first synchronized method 
    synchronized void test1(Shared s2) 
    { 
        System.out.println("test1-begin"); 
        ThreadUtil.sleep(1000); 
   
        System.out.println("test1-locking s1");
        System.out.println("test1-waiting s2");
        // taking object lock of s2 enters 
        // into test2 method
        while (variable){
            s2.test2(this);
        }
        variable = false;
        System.out.println("test1-end");
        notify();
    }
  
    // second synchronized method 
    synchronized void test2(Shared s1) 
    { 
        System.out.println("test2-begin"); 
        ThreadUtil.sleep(1000);
  
        System.out.println("test2-locking s2");
        System.out.println("test2-waiting s1");
        // taking object lock of s1 enters 
        // into test1 method
        while (variable){
            s1.test1(this);
        }
        variable = false;
        System.out.println("test2-end");
        notify();
    }
}
