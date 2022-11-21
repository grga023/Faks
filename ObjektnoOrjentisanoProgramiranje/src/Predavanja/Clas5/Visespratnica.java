package Predavanja.Clas5;

public class Visespratnica extends GObject{

    public Visespratnica(String tip) {
        super(tip);
    }

    public String toString() {
        return "Visespratnica: "+getTip();
    }
}
