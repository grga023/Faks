package Predavanja.Clas3.At2;

public class ProdajnoOdeljenje {
    private TehnickaRoba _tehnickaRoba;
    private RobnaKuca _robnaKuca;
    private int zalihe;

    public ProdajnoOdeljenje(String tip, String naziv, double suma, int kolicina){
        zalihe = 0;
        _robnaKuca = new RobnaKuca(tip, naziv, suma, kolicina);
        _tehnickaRoba = new TehnickaRoba(tip, naziv, suma, kolicina);
    }

    public void setZalihe(int zalihe){
        this.zalihe = zalihe;
    }

    public int getZalihe(){return zalihe;}

    public void nabavi(double suma, int kolicina){
        _robnaKuca.nabavi(suma, kolicina);
    }

}
