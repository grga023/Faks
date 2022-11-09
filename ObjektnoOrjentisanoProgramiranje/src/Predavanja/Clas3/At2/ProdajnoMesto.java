package Predavanja.Clas3.At2;


public class ProdajnoMesto {
    private String tip;
    private String naziv;

    public ProdajnoMesto(String naziv, String tip) {
        this.tip = tip;
        this.naziv = naziv;
    }

    public ProdajnoMesto() {

    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getTip() {
        return tip;
    }
}

