package Vezbe.Clas3.Tas2;

public class CDInfo {
    CD _cd;
    private String AutorInfo;

    public CDInfo(String naziv){
        _cd = new CD(naziv);
    }
    public CDInfo(String naziv, int trajanje, String autorInfo, String datumIzdavanja) {
     _cd = new CD(naziv, datumIzdavanja, trajanje);
     _cd.setBrDana(730);
     setAutorInfo(autorInfo);
    }
    public CDInfo(String naziv, String datumIzdavanja, int trajanje){
        _cd = new CD(naziv, datumIzdavanja, trajanje);
        this.AutorInfo = "Nepoznato";
        _cd.setBrDana(10);

    }

    public void setAutorInfo(String autorInfo) {
        AutorInfo = autorInfo;
    }

    public String getAutorInfo() {
        return AutorInfo;
    }

    public String iznajmi(){
        return _cd.toString();
    }

}
