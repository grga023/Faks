package Predavanje.Clas3.Task2;

public class Producer extends Thread {

    private final SharedResource sr;

    public Producer(SharedResource sr) {
        super();
        this.sr = sr;
    }
    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */

    @Override
    public void run() {
        char ch;

        for(ch = 'A'; ch <= 'z'; ch++){
            sr.setValue(ch);
            System.out.println("Producer:: set:" + ch);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}