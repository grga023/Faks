package Zad1;

public class IgraniFilm extends VideoKaseta{
    private String reziser;

    private String zanr;

    public IgraniFilm(String naziv, double duzina, boolean dostupnost, String reziser, String zanr) {
        super(naziv, duzina, dostupnost);
        setReziser(reziser);
        setZanr(zanr);

    }

    public String getReziser() {
        return reziser;
    }

    public void setReziser(String reziser) {
        this.reziser = reziser;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String toString(){
        String out = super.toString() +"\nFilm je rezirao: "+getReziser()+"i njegov zanr je: "+getZanr();
        return out;
    }
}
