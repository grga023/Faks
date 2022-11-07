package Predavanja.Clas3;

public class ProdajnoOdeljenje {
    private int zalihe;
    private  RobnaKuca _robnaKuca;
    private TehnickaRoaba _tehnickaRoba;


    public ProdajnoOdeljenje(RobnaKuca robnaKuca, TehnickaRoaba tehnickaRoaba){
        _robnaKuca = robnaKuca;
        _tehnickaRoba = tehnickaRoaba;
        zalihe = 0;
    }

    public ProdajnoOdeljenje() {

    }

    public void nabavi(int kolicina, int cena){
        double total = _tehnickaRoba.nabavi(kolicina, cena);
        _robnaKuca.nabavi(total);
    }
}
