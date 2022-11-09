package Predavanja.Clas3.At2;

public class TehnickaRoba {
    private ProdajnoOdeljenje _prodajnoOdeljenje;

    private double cena;
    private int kolicina;

    public TehnickaRoba(String tip, String naziv, double suma, int kolicina){
        _prodajnoOdeljenje = new ProdajnoOdeljenje(tip, naziv, suma, kolicina);
        kolicina = _prodajnoOdeljenje.getZalihe();
        this.cena = 500;
        nabavi();
    }

    public void nabavi(){
        double total = cena * kolicina;
        _prodajnoOdeljenje.nabavi(total, kolicina);
    }

}
