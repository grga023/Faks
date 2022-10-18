package Predavanja.Basics;

public abstract class Location {
    private int x;
    private int y;


    public Location(){
        super();
        x=0;
        y=0;
    }

    public Location(int x, int y){
        super();
        this.x = x;
        this.y = y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
