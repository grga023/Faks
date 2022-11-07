package Predavanje.Clas2.Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class DA extends Thread {
    private boolean isTerminated = false;
    ChildThread childThread = new ChildThread(0);
    @Override
    public void run() {
        System.out.println("Started");
        int i = 0;
        while (!isTerminated) {
            String state = "";
            if(i == 0){
                state = String.valueOf(childThread.getState());
            }
            else if (i == 1) {
                childThread.start();
                state = String.valueOf(childThread.getState());
            }
            else if (i == 2) {
                childThread.setSleep(1000);
                state = String.valueOf(childThread.getState());
            }
            else if (i == 3) {
                childThread.isTerminated();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                state = String.valueOf(childThread.getState());
            }
            else if(i == 4){
                isTerminated = true;
                break;
            }

            i++;


            try {
                File file = new File("tredovi.txt");
                FileWriter thread = new FileWriter(file, true);
                thread.write("Child thread is: "+state+ "\n");
                thread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            childThread.setSleep(0);

        }

        System.out.println("Terminated");

    }

    public void isTerminated(){
        isTerminated = true;
    }
}
