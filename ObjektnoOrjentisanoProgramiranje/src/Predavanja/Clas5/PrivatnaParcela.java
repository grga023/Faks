package Predavanja.Clas5;

public class PrivatnaParcela extends Parcela{
    int vlasnik;

    private int brObjekata;
    private GObject objekti[];

    public PrivatnaParcela(int brObjekata) {
        this.brObjekata = 0;
        objekti = new GObject[brObjekata];
    }

    public boolean isEmpty() {
        return brObjekata==0;
    }

    public boolean isFull() {
        return brObjekata==objekti.length;
    }

    public int brObjekata() {
        return brObjekata;
    }

    public void clear() {
        for (int i=0; i<objekti.length;i++) {
            objekti[i]=null;
        }
    }

    public boolean addObject(GObject objekat) {
        if(!(objekat instanceof PKuca)  && !(objekat instanceof  SKuca) && !(objekat instanceof  Visespratnica)) {
            return false;
        }
        if (isFull()) return false;
        for (int i=0; i<objekti.length;i++) {
            if (objekti[i]==null) {
                objekti[i]=objekat;
                brObjekata++;
                break;
            }
        }
        return true;
    }

    public PKuca takePKuca(String tip) {
        for (int i=0; i<objekti.length;i++) {
            if (objekti[i]!=null  && objekti[i].getTip().equals(tip) && objekti[i] instanceof  PKuca) {
                PKuca pk = (PKuca) objekti[i];
                objekti[i]=null;
                brObjekata--;
                return pk;
            }
        }
        return null;
    }

    public SKuca takeSKuca(String tip) {
        for (int i=0; i<objekti.length;i++) {
            if (objekti[i]!=null  && objekti[i].getTip().equals(tip) && objekti[i] instanceof  PKuca) {
                SKuca sk = (SKuca) objekti[i];
                objekti[i]=null;
                brObjekata--;
                return sk;
            }
        }
        return null;
    }
}

