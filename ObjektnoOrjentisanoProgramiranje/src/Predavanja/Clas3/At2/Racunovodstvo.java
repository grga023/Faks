package Predavanja.Clas3.At2;

public class Racunovodstvo {
    private double stanje;
    private int kolicina;
    public Racunovodstvo(double suma, int kolicina){
        stanje += suma;
        this.kolicina += kolicina;
    }

    public void nabavi(double suma, int kolicina){
        if(stanje - suma > 0 || this.kolicina - kolicina > 0) {
            stanje -= suma;
            this.kolicina -= kolicina;
        }
        else System.out.println("Greska pri nabavljanju!! Tenutno stanje je: " +getStanje());
    }


    public double getStanje(){return stanje;}

    public int getKolicina() {return kolicina;}
}
