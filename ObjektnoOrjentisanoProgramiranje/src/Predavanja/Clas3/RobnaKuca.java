package Predavanja.Clas3;

public class RobnaKuca extends ProdajnoMesto {

    private ProdajnoMesto _prodajnoMesto;
    private Racunovodstvo _racunovodstvo;
    private ProdajnoOdeljenje _prodajnoOdeljenje;
    private int ID;
    private double povrsina;
    private int prostor;

    public RobnaKuca( ProdajnoOdeljenje prodajnoOdeljenje, Racunovodstvo racunovodstvo, ProdajnoMesto prodajnoMesto) {
        _prodajnoOdeljenje = prodajnoOdeljenje;
        _racunovodstvo = racunovodstvo;
        _prodajnoMesto = prodajnoMesto;
    }

    public RobnaKuca(String naziv, String tip, int ID){
        _prodajnoMesto.setNaziv(naziv);
        _prodajnoMesto.setNaziv(tip);
        this.ID = ID;
    }

    public void getStanje(){
        _racunovodstvo.getSredstva();
    }

    public void setStanje(double stanje){
        _racunovodstvo.setSredstva(stanje);
    }


    public void nabavi(double total) {
    }
}
