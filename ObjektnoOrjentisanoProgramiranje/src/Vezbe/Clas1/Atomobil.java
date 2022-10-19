package Vezbe.Clas1;

public class Atomobil {
    private int Kubikaza;
    private int Godiste;
    private int Brzina;

    public void changeK(int newK){
        Kubikaza = newK;
    }

    public void changeG(int newG){
        Godiste = newG;
    }
    public void changeB(int newB){
        Brzina = newB;
    }

    public void decr(int decrement){
        Brzina -=decrement;
    }

    public void print(){
        System.out.println("Kubikaza: "+Kubikaza+ "cc Godiste: "+Godiste+". Brzina: "+Brzina+"km/h " );

    }
}
