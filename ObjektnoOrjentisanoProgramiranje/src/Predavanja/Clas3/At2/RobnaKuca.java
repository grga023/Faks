package Predavanja.Clas3.At2;


public class RobnaKuca extends ProdajnoMesto{

    private Racunovodstvo _racunovodstvo;
    private ProdajnoOdeljenje _prodajnoOdeljenje;

    public RobnaKuca(String tip, String naziv, double suma, int kolicina){
        super(naziv, tip);
        _racunovodstvo = new Racunovodstvo(suma, kolicina);
        _prodajnoOdeljenje = new ProdajnoOdeljenje(tip, naziv, suma, kolicina);
        setZalihe();
    }



    public void nabavi(double suma, int kolicina){
        _racunovodstvo.nabavi(suma, kolicina);
    }


    public double getStanje(){
        return _racunovodstvo.getStanje();
    }

    public void setZalihe(){
        _prodajnoOdeljenje.setZalihe(_racunovodstvo.getKolicina());
    }

    public void Ispis(){
        System.out.println("Trenutno stanje je: " +_racunovodstvo.getStanje()+ ", ukupna kolicina je: "+_racunovodstvo.getKolicina());
    }

}
