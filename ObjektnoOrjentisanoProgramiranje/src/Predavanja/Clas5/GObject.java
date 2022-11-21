package Predavanja.Clas5;

public class GObject {
    private String tip;

    public GObject(String tip) {
        this.tip=tip;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String toString() {
        return "GObject, tip: "+tip;
    }
}

