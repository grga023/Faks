package Predavanja.Clas3;

public class ProdajnoMesto {
    private String tip;
    private String naziv;

    public ProdajnoMesto(){
        this.naziv = "";
        this.tip = "";
    }

    public ProdajnoMesto(String naziv, String tip) {
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
