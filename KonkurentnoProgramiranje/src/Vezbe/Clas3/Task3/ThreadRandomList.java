package Vezbe.Clas3.Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThreadRandomList extends Thread{
    private ArrayList <Integer> randomInt;
    private int oddCounter;
    private int evenCounter;

    public ThreadRandomList() {
        oddCounter = 0;
        evenCounter = 0;
        randomInt = new ArrayList<Integer>();
    }

    private void addToList() throws IOException {
        File file = new File("randomInt.txt");
        FileWriter thread = new FileWriter(file, true);
        for (Integer integer: randomInt) {
            thread.write(integer+" ||\n");
        }
        thread.close();
    }

    private void generateNumber() throws InterruptedException, IOException {
        for(int i = 1; i <= 100; i++){
            int min = 1;
            int max = 100;
            int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
            if(evenCounter < 13){
                if(random_int % 2 == 0){
                    randomInt.add(random_int);
                    evenCounter++;
                }
            }
            if (oddCounter < 11) {
                if (random_int % 2 == 1) {
                    randomInt.add(random_int);
                    oddCounter++;
                }
            }
            Thread.sleep(100);
        }

        addToList();
    }

    @Override
    public void run() {
        try {
            generateNumber();
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
