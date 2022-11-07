package Predavanja.Clas3;

public class Racunovodstvo {
    private RobnaKuca _robnaKuca;
    private double sredstva;

    private Racunovodstvo(RobnaKuca robnaKuca){
        _robnaKuca = robnaKuca;
        sredstva = 0;
    }

    public void setSredstva(double sredstva) {
        this.sredstva = sredstva;
    }

    public double getSredstva() {
        return sredstva;
    }
}
