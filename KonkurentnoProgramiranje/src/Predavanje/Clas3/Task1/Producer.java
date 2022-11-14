package Predavanje.Clas3.Task1;

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
        for(int i = 0; i<3; i++){
            for (ch = 'A'; ch <= 'Z'; ++ch) {
                sr.setValue(ch);
                System.out.println("Producer:: set:" + ch);
            }
        }

    }
}