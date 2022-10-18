package Predavanja.Basics;

public class PrivatnaParcela extends Parcela{
    private Osoba vlasnik;
    private int gradnja;

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getGradnja() {
        return gradnja;
    }

    public void setGradnja(int gradnja) {
        this.gradnja = gradnja;
    }

    public PrivatnaParcela(int x, int y, int katastarskiBroj, int povrsina, Osoba vlasnik, int gradnja) {
        super(x, y, katastarskiBroj, povrsina);
        this.vlasnik = vlasnik;
        this.gradnja = gradnja;
    }

    public PrivatnaParcela(){
        super();
        gradnja = 0;
        vlasnik = null;
    }
}
