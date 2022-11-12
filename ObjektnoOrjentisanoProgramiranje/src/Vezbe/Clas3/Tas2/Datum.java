package Vezbe.Clas3.Tas2;

public class Datum {
    private int dan;

    private int mesec;
    private int godina;
    public Datum(int dan, int mesec, int godina){
        this.dan = dan;
        this.mesec = mesec;
        this.godina =godina;
    }

    public void sledeci(){
        setDan(getDan()+1);
        int prestupna = getGodina() % 4;
        if(getMesec() == 1 || getMesec() == 3 || getMesec() == 5 || getMesec() == 7 || getMesec() == 8 || getMesec() == 10 || getMesec() == 12 && getDan() == 32){
            if(getMesec() == 12 && dan == 32){
                setGodina(getGodina()+1);
                setMesec(1);
                setDan(1);
            }else {
                setMesec(getMesec()+1);
                setDan(1);
            }
        }
        else if(getMesec() == 4 || getMesec() == 6 || getMesec() == 9 || getMesec() == 11 && getDan() == 31){
            setDan(1);
            setMesec(getMesec()+1);
        }else if(getMesec() == 2 && getDan() == 29 && prestupna != 0){
            setDan(1);
            setMesec(getMesec()+1);
        }else if(getMesec() == 2 && getDan() == 30 && prestupna == 0){
            setMesec(getMesec()+1);
            setDan(1);
        }
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

    public String toString(){
        String out = ""+getDan()+":"+getMesec()+":"+getGodina();
        return out;
    }
}
