package Vezbe.Clas3.Task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class ThreadString extends Thread{
    private int counter;
    private int maxCounter;
    private char ch;
    private String[] string;

    public ThreadString(int maxCounter){
        this.maxCounter = maxCounter;
        string = new String[maxCounter];
        counter = 1;
    }

    private void creatstring() throws InterruptedException {
        Random random = new Random();
        for(counter = 0; counter < maxCounter; counter++){
            int min = 97;
            int max = 122;
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            ch = (char) random_int;
            string[counter] = String.valueOf(ch);
            System.out.println( "String je: "+string[counter]+"  "+counter);

            try {
                File file = new File("tc.txt");
                FileWriter thread = new FileWriter(file, true);
                thread.write(string[counter]+" " +counter+"||");
                thread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            Thread.sleep(200);
        }
    }

    @Override
    public void run() {
        try {
            creatstring();
        } catch (InterruptedException e) {
            return;
        }
    }
}
