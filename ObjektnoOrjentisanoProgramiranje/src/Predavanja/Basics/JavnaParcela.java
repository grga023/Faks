package Predavanja.Basics;

public class JavnaParcela extends Parcela{
    boolean gradnja;


    public boolean isGradnja() {
        return gradnja;
    }

    public void setGradnja(boolean gradnja) {
        this.gradnja = gradnja;
    }

    public JavnaParcela(){
        super();
        gradnja = false;
    }
}
