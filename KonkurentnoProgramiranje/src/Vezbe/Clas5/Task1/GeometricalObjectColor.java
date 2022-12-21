package Vezbe.Clas5.Task1;

public class GeometricalObjectColor {
    private String color;

    private boolean filled;


    public GeometricalObjectColor(){
        this.color = "";
        this.filled = false;
    }


    public synchronized void setWhite() throws InterruptedException {
        while (filled)
            wait();
        filled = true;
        notify();
    }

    public synchronized void setBlack() throws InterruptedException {
        while (!filled)
            wait();
        filled = false;
        notify();
    }

    public synchronized void SetColor(String color){
        setColor(color);
        filled = false;
        notify();
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
