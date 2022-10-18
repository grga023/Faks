package Predavanja.Basics;

public abstract class Parcela extends Lokacija {
    private int katastarskiBroj;
    private int povrsina;


    public Parcela(){
        super();
        katastarskiBroj = 0;
        povrsina = 0;
    }

    public int getKatastarskiBroj() {
        return katastarskiBroj;
    }

    public void setKatastarskiBroj(int katastarskiBroj) {
        this.katastarskiBroj = katastarskiBroj;
    }

    public int getPovrsina() {
        return povrsina;
    }

    public void setPovrsina(int povrsina) {
        this.povrsina = povrsina;
    }

    public Parcela(int x, int y,int katastarskiBroj, int povrsina) {
        super(x,y);
        this.katastarskiBroj = katastarskiBroj;
        this.povrsina = povrsina;
    }
}
