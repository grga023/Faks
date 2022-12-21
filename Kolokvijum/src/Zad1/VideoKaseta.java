package Zad1;

public class VideoKaseta {
    private String naziv;
    private double trajanje;
    private volatile boolean dostupnost;

    public VideoKaseta(String naziv, double trajanje, boolean dostupnost){
        this.naziv = naziv;
        this. trajanje = trajanje;
        this.dostupnost = dostupnost;
    }
    public VideoKaseta(String naziv){
        this.naziv = naziv;
        this. trajanje = 60;
        this.dostupnost = true;
    }

    public String toString(){
        String out = naziv+" traje: "+trajanje+" i kaseta je "+(dostupna()? "dostupna":"nedostupa");
        return out;
    }

    private boolean dostupna(){
        if(dostupnost)
            return true;
        else return false;
    }
}
