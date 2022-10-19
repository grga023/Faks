package Vezbe.Clas1;

public class Mmain {
    public static void main(String[] args) {
        
        Atomobil automobil1 = new Atomobil();
        Atomobil automobil2 = new Atomobil();

        Covek covek1 = new Covek();
        Covek covek2 = new Covek();

        System.out.println("Covek:");

        covek1.changeG(2001);
        covek1.chabgeV(187);
        covek1.changeT(87);
        covek1.changeWaith(-7);
        covek1.print();

        covek2.changeG(1979);
        covek2.chabgeV(165);
        covek2.changeT(75);
        covek2.changeWaith(4);
        covek2.print();

        System.out.println("\n ------------------------------------------------------------ ");
        System.out.println("Auto:");

        automobil1.changeK(3000);
        automobil1.changeG(2006);
        automobil1.changeB(250);
        automobil1.decr(10);


        automobil2.changeK(2500);
        automobil2.changeG(2019);
        automobil2.changeB(273);

        automobil1.print();
        automobil2.print();
    }
}
