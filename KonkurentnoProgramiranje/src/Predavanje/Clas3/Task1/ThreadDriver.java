package Predavanje.Clas3.Task1;


public class ThreadDriver {

    public static void main(String[] args) {
        SharedResource sr = new SharedResource();

        Producer producer = new Producer(sr);
        Consumer consumer1 = new Consumer(sr, "Djordjije");
        Consumer consumer2 = new Consumer(sr, "Domagoj");
        Consumer consumer3 = new Consumer(sr, "Mitar");

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

    }


}
