package Vezbe.Clas3.Tas2;

public class Datum {
    private int dan;

    private String datum;

    private int mesec;
    private int godina;
    public Datum(String datum){
        this.datum = datum;
        setDatum();
    }

    public void sledeci(String trenutni){
        this.datum = trenutni;
        setDatum();
//        System.out.println(getDatum()+" "+dan+" "+mesec+" "+godina);
        setDan(dan+1);
        int prestupna = godina % 4;
        if((mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7 || mesec == 8 || mesec == 10 || mesec == 12) && dan == 32){
            if(mesec == 12 && dan == 32){
                setGodina(godina+1);
                setMesec(1);
                setDan(1);
            }else if(dan == 32) {
                setMesec(mesec+1);
                setDan(1);
            }
        }
        else if((mesec == 4 || mesec == 6 || mesec == 9 || mesec == 11) && dan == 31){
            setDan(1);
            setMesec(mesec+1);
        }else if(mesec == 2 && dan == 29 && prestupna != 0){
            setDan(1);
            setMesec(mesec+1);
        }else if(mesec == 2 && dan == 30 && prestupna == 0){
            setMesec(mesec+1);
            setDan(1);
        }
        setDatum(dan, mesec, godina);
    }

    public String jeManji(int dan1, int mesec1, int godina1, int dan2, int mesec2, int godina2){
        String out;
        if(godina1 > godina2){
            out = ""+dan1+":"+mesec1+":"+godina1;
            return out;
        }else if(godina1 < godina2){
            out = ""+dan2+":"+mesec2+":"+godina2;
            return out;
        }else if(godina1 == godina2 && mesec1 > mesec2){
            out = ""+dan1+":"+mesec1+":"+godina1;
            return out;
        } else if (godina1 == godina2 && mesec1 < mesec2) {
            out = ""+dan2+":"+mesec2+":"+godina2;
            return out;
        } else if (godina1 == godina2 && mesec1 == mesec2 && dan1 > dan2) {
            out = ""+dan1+":"+mesec1+":"+godina1;
            return out;
        } else if (godina1 == godina2 && mesec1 == mesec2 && dan1 < dan2) {
            out = ""+dan2+":"+mesec2+":"+godina2;
            return out;
        }
        return "";
    }

    public String getDatum() {
        return datum;
    }
    public int getDan() {
        return dan;
    }

    public void setDan(int dan) {
        this.dan = dan;
    }

    public int getMesec() {
        return mesec;
    }

    public void setMesec(int mesec) {
        this.mesec = mesec;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    private void setDatum(){
        if(datum.charAt(1) == '-' && datum.charAt(3) == '-'){
            setDan(Integer.parseInt(datum.charAt(0)+""));
            setMesec(Integer.parseInt(datum.charAt(2) +""));
            setGodina(Integer.parseInt(datum.charAt(4) +""+ datum.charAt(5) +""+ datum.charAt(6) +""+ datum.charAt(7)));
        }
        else if(datum.charAt(1) == '-'){
            setDan(Integer.parseInt(datum.charAt(0)+""));
            setMesec(Integer.parseInt(datum.charAt(2) +""+ datum.charAt(3)));
            setGodina(Integer.parseInt(datum.charAt(5) +""+ datum.charAt(6) +""+ datum.charAt(7) +""+ datum.charAt(8)));
        }
        else if(datum.charAt(4) == '-'){
            setDan(Integer.parseInt(datum.charAt(0) +""+ datum.charAt(1)));
            setMesec(Integer.parseInt(datum.charAt(3) +""));
            setGodina(Integer.parseInt(datum.charAt(5) +""+ datum.charAt(6) +""+ datum.charAt(7) +""+ datum.charAt(8)));
        }
        else if(datum != null && !datum.equals("")) {
            setDan(Integer.parseInt(datum.charAt(0) +""+ datum.charAt(1)));
            setMesec(Integer.parseInt(datum.charAt(3) +""+ datum.charAt(4)));
            setGodina(Integer.parseInt(datum.charAt(6) +""+ datum.charAt(7) +""+ datum.charAt(8) +""+ datum.charAt(9)));
        }
    }
    private void setDatum(int dan, int mesec, int godina){
        this.datum = dan+"-"+mesec+"-"+godina;
    }

}
