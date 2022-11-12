package Vezbe.Clas3.Tas2;

public class CD {
    Datum _datum;

    private String naziv;

    private int trajanje;

    private String datumIzdavanja;

    private int brDana = 10;

    public CD(){

    }

    public CD(String naziv){
        setNaziv(naziv);
        trajanje = 90;
    }

    public CD(String naziv, String datumIzdavanja, int trajanje){
        _datum = new Datum(datumIzdavanja);
        setNaziv(naziv);
        setTrajanje(trajanje);
        setDatumIzdavanja(datumIzdavanja);
    }

    public void datumVracanja(){
        for(int i = 1; i <= brDana; i++){
            _datum.sledeci(datumIzdavanja);
            this.datumIzdavanja = _datum.getDatum();
        }
    }
    public String toString(){
        datumVracanja();
        String out = "Naslov CD-a je: "+getNaziv()+". Duzina trajanja je: "+getTrajanje()+". Zakazano vracanje je: "+_datum.getDatum();
        return out;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public String getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(String datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }


    public int getBrDana() {
        return brDana;
    }

    public void setBrDana(int brDana) {
        this.brDana = brDana;
    }
}
