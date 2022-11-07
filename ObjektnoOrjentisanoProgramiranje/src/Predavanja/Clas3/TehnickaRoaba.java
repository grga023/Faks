package Predavanja.Clas3;

public class TehnickaRoaba extends ProdajnoOdeljenje{

    private ProdajnoOdeljenje _prodajnoOdeljenje;

    public TehnickaRoaba(ProdajnoOdeljenje prodajnoOdeljenje) {
        super();
        _prodajnoOdeljenje = prodajnoOdeljenje;
    }

    public double nabavi(int kolicina, double cena){
        cena *= kolicina;
        return cena;
    }
}
