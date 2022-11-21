package Predavanja.Clas5;

public class ZdravstvenaUstanova extends GObject {

    public ZdravstvenaUstanova(String tip) {
        super(tip);
    }

    public String toString() {
        return "Zdravstvena ustanova: "+getTip();
    }
}

