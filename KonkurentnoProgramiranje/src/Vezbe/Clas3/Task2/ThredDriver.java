package Vezbe.Clas3.Task2;

public class ThredDriver {
    public static void main(String[] args) throws InterruptedException {

        ThreadCounterOdd threadCounterOdd = new ThreadCounterOdd(200, 1);
        ThreadString threadString = new ThreadString(700);

        threadString.start();
        threadCounterOdd.start();

        int counter = 1;
        int sum = 0;

        do{
            int kaunter = counter;
            sum = 0;
            do {
               int modul = kaunter % 10;
               sum+=modul;
               kaunter = kaunter/10;
            }while (kaunter != 0);
         counter++;
         Thread.sleep(100);
         if(sum == 10){
             threadCounterOdd.interrupt();
         }
         if(sum == 14){
             threadString.interrupt();
         }
        }while (counter <= 100);

        System.out.println("--------Main terminated--------");
    }
}
