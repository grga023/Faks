package Predavanje.Clas3.Task2;

public class SharedResource {

    private char value;
    // indicates if the value could be updated
    private volatile boolean writable = true;
    /**
     * @return the value
     */
    public synchronized char getValue() {
        // if value is writable, the current thread should wait
        // until other threads completes the operation
        while(writable) {
            try {
                wait();
            } catch (InterruptedException ie){
            }
        }
        // change state to writable and notify other threads
        // that are waiting n this object
        writable = true;
        notify();
        return value;
    }
    /**
     * @param value the value to set
     */
    public synchronized void setValue(char value) {
        // if shared resource is not writable and it has to be updated
        // the current thread performs wait
        while(!writable) {
            try {
                wait();
            } catch (InterruptedException ie){
            }
        }
        // update resource and change status of writable
        this.value = value;
        writable = false;

        // notify() on this object so other threads waiting on this object
        // can can go to work
        notify();
    }




}
