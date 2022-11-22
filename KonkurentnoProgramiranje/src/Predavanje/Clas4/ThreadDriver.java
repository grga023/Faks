package Predavanje.Clas4;

public class ThreadDriver {
    public static void main(String[] args) {
        Student st = new Student();
        KrreatorStudent kreirajStudenta = new KrreatorStudent("Ognjen", "Grgur", "SI 10/20", 3, 24, 8.8);
        KrreatorStudent kreirajStudenta2 = new KrreatorStudent("Ognjen", "Grgur", "SI 10/29", 3, 24, 8.8);
        KrreatorStudent kreirajStudenta3 = new KrreatorStudent("Ognjen", "Grgur", "SI 10/28", 3, 24, 8.8);

        IzmenaProseka izmenaProseka = new IzmenaProseka(st);


        kreirajStudenta.start();
        kreirajStudenta2.start();
        kreirajStudenta3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        izmenaProseka.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
