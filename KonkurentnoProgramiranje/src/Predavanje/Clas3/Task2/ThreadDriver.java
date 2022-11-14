package Predavanje.Clas3.Task2;


public class ThreadDriver {

    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        Producer producer = new Producer(sr);
        ConsumerUpper consumer1 = new ConsumerUpper(sr, "Djordjije");
        ConsumerLpwer consumer2 = new ConsumerLpwer(sr, "Domagoj");


        producer.start();
        consumer1.start();

        consumer2.start();



    }


}
