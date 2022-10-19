package Vezbe.Clas1;

public class Covek {
    public int Visina = 0;
    public int Tezina = 0;
    public int Godiste = 0;
    public int Changed = 0;

    public void chabgeV(int newK){
        Visina = newK;
    }

    public void changeT(int newG){
        Tezina = newG;
    }
    public void changeG(int newB){
        Godiste = newB;
    }

    public void changeWaith(int valeForChange){
        Changed = Tezina + valeForChange;
    }
    public void print(){
        System.out.println("Viisina: "+Visina+ "cm Godiste: "+Godiste+". Tezina: "+Tezina+"kg Nova tezina: "+Changed+"kg" );

    }
}
