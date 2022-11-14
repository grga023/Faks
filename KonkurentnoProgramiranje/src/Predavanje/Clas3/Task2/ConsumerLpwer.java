package Predavanje.Clas3.Task2;

public class ConsumerLpwer extends Thread {

    private final SharedResource sr;
    private String name;
    int id;
    public ConsumerLpwer(SharedResource sr, String name) {
        this.sr = sr;
        this.name = name;
    }



    /* (non-Javadoc)
     * @see java.lang.Thread#run()
     */
    @Override
    public void run() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        char ch;
        do {
            ch = sr.getValue();
            if((ch >= 'a') && (ch <='z')){
                System.out.println("Consumer "+name+": get:" + ch);
            }
        } while(ch != 'z');
    }
}

