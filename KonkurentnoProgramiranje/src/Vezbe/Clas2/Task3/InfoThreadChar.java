package Vezbe.Clas2.Task3;

import java.util.Locale;

public class InfoThreadChar extends Thread {
    private long sleep;
    private int threadId;
    private String letter;
    private volatile boolean isTerminated;
    private volatile boolean isUpper;
    public  InfoThreadChar(int id, long sleep){
        this.threadId = id;
        this.sleep = sleep;
        this.isTerminated = false;
        this.isUpper = false;
        this.letter = "a";
    }

    @Override
    public void run() {
        while (!isTerminated){
            if(!isUpper){
                this.letter = this.letter.toLowerCase();
            }
            else if(isUpper) this.letter = this.letter.toUpperCase();
        }
    }

    public long getSleep() {return sleep;}

    public void terminateThreadEven() {
        this.isTerminated = true;
    }
    public void isUpper(){
        if(this.isUpper){
            this.isUpper = false;
        }
        else{
            this.isUpper = true;
        }
    }

    public void setLetter(String letter){
        this.letter = letter;
    }

    public String getLetter(){return letter;}

    public boolean getStats(){
        if(!isUpper) {
            return false;
        }
        else{
            return true;
        }
    }

}
