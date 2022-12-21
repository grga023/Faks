package Vezbe.Clas5.Task1;

public class ThreadColor2 extends Thread{
    GeometricalObjectColor goc = new GeometricalObjectColor();

    private int ID;

    public ThreadColor2(int ID){
        this.ID = ID;
    }

    private void setColorBlack(){
        goc.SetColor("Black");
    }
    private void setColorWhite(){
        goc.SetColor("White");
    }


    @Override
    public void  run() {
        System.out.println("Thread ["+getID()+"] Started");
        try {
            goc.setWhite();
            goc.setColor("White");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getID()+" Nit je: "+goc.getColor());


        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try {
            goc.setBlack();
            goc.setColor("Black");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(getID()+" Nit je: "+goc.getColor());
        System.out.println("Thread ["+getID()+"] terminated");
    }

    public int getID() {
        return ID;
    }
}
