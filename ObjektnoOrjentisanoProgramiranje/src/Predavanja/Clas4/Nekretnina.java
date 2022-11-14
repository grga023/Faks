package Predavanja.Clas4;

public class Nekretnina {
    public static final int PRIZEMNA_KUCA = 0, SPRATN_KUCA = 1, VISESPRATNICA = 2;

    protected int tip;

    public Nekretnina(int tip){
        this.tip = tip;
    }

    public int getTip() {
        return tip;
    }

    @Override
    public String toString(){
        return "Tip:" +tip+" ";
    }
}
