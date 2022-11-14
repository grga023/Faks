package Predavanje.Clas3.Task2;

public class ConsumerUpper extends Thread {

    private final SharedResource sr;
    private String name;
    int id;
    public ConsumerUpper(SharedResource sr, String name) {
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
            if((ch >= 'A') && (ch <='Z')){
            System.out.println("Consumer "+name+": get:" + ch);
        }
        } while(ch != 'z');
    }
}

