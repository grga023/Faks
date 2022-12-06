package Vezbe.Clas4.Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThreadDriver {
    public static void main(String[] args) throws IOException {

        ThreadString tcS = new ThreadString();
        ThreadCounter tcC = new ThreadCounter();

        boolean isTerminated = false;
        char key;
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int s = 0;
        while (!isTerminated){
            System.out.println("Insert:");
            key = sc.next().charAt(0);

            switch (key){
                case '1':
                    if(c == 0){
                        tcC.start();
                        c++;
                    }
                    else{
                        if(tcC.isSusoended()){
                            tcC.setSuspended(false);
                        }
                        else tcC.setSuspended(true);
                    }
                    break;
                case '2':
                    if(s == 0){
                        tcS.start();
                        s++;
                    }
                    else{
                        if(tcS.isSusoended()){
                            tcS.setSuspended(false);
                        }
                        else tcS.setSuspended(true);
                    }
                    break;
                case 's':
                    print(tcC, tcS, 'r');
                    break;
                case  't':
                    print(tcC,tcS, 's');
                    tcS.interrupt();
                    tcC.interrupt();
                    isTerminated = true;
                    break;
                default: break;
            }
        }

        System.out.println("---------Main terminated---------");
    }
    private static void print(ThreadCounter threadCounter, ThreadString threadString, char c) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        File file = new File("Stats.txt");
        FileWriter thread = new FileWriter(file, true);
        if(c == 'r')
            thread.write("["+dtf.format(now) +"] - Nit ThreadCounter "+(threadCounter.isSusoended()? " je suspendovana":"nije suspendovana")+ ", a nit ThreadString "+(threadString.isSusoended()? "je suspendovana":"nije suspendovana")+".\n");
        else thread.write("\t\t\t\t\t["+dtf.format(now)+"] - program je terminiran!");
        thread.close();
    }

}
