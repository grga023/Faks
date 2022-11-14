package Predavanje.Clas3.Task1;

public class Consumer extends Thread {

    private final SharedResource sr;
    private String name;
    public Consumer(SharedResource sr, String name) {
        this.sr = sr;
        this.name = name;
    }

    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        char ch;

        do {
            ch = sr.getValue();
            System.out.println("Consumer "+name+": get:" + ch);
        } while(ch != 'Z');
        System.out.println();
    }




}

