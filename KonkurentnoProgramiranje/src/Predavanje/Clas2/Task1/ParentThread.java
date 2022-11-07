package Predavanje.Clas2.Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;

public class ParentThread extends Thread {
    private boolean isTerminated = false;
    ChildThread childThread = new ChildThread();
    @Override
    public void run() {
        System.out.println("Started");

            while (!isTerminated) {

                if (!childThread.isDaemon()) {
                    childThread.setDaemon(true);
                }
                else {childThread.setDaemon(false);}

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            try {
                File file = new File("tredovi.txt");
                FileWriter thread = new FileWriter(file, true);
                thread.write("tc is: "+(childThread.isDaemon()? "is deamon": "is non deamon"+ "")+ "\n");
                thread.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            }
        System.out.println("Terminated");

    }

    public void isTerminated(){
        isTerminated = true;
    }
}
