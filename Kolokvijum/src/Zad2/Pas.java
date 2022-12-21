package Zad2;

public class Pas extends Zivotinja{

    private String rasa;

    private String ime;

    public Pas(String ime, String rasa){
        super();
        setVrsta();
        setIme(ime);
        setRasa(rasa);
    }



    public String getRasa() {
        return rasa;
    }

    private void setVrsta(){
        super.setVrsta("Pas");
    }

    public void setRasa(String rasa) {
        if(rasa == ""){
            this.rasa = "Rotvajler";
        }
        else this.rasa = rasa;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    @Override
    public String toString(){
        String out;
        out = "Vrsta zivotinje: " +super.getVrsta()+ " rasa: " +getRasa()+" ime: "+getIme();
        return out;
    }
}
