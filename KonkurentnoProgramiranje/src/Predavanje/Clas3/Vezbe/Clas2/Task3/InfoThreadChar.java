package Predavanje.Clas3.Vezbe.Clas2.Task3;

import java.util.Locale;

public class InfoThreadChar extends Thread {
    private long sleep;
    private int threadId;
    private char letter;
    private volatile boolean isTerminated;
    private volatile boolean isUpper;
    public  InfoThreadChar(int id, long sleep, char letter){
        this.threadId = id;
        this.sleep = sleep;
        this.isTerminated = false;
        this.isUpper = false;
        this.letter = letter;
    }

    @Override
    public void run() {
        while (!isTerminated){
            if(!isUpper){
                this.letter = getLover(this.letter);
            }

            else if(isUpper) this.letter = getUpper(this.letter);

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public long getSleep() {return sleep;}

    public void terminateThreadEven() {
        this.isTerminated = true;
    }
    public boolean isTerminated(){
        if (!this.isTerminated) {
            return false;
        } else {
            return true;
        }
    }
    public void isUpper() {
        if(this.isUpper){
            this.isUpper = false;
        }
        else{
            this.isUpper = true;
        }
    }

    public void setLetter(char letter){
        this.letter = letter;
    }

    public char getLetter(){return letter;}

    public char getUpper(char letter){
        String upper = String.valueOf(letter);
        upper = upper.toUpperCase();
        letter = upper.charAt(0);
        return letter;
    }
    public char getLover(char letter){
        String upper = String.valueOf(letter);
        upper = upper.toLowerCase();
        letter = upper.charAt(0);
        return letter;
    }
    public boolean getStats(){
        if(!isUpper) {
            return false;
        }
        else{
            return true;
        }
    }

}
