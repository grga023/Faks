package Vezbe.Clas2;

public class Cube {
    public int lenght;
    public int widtth;
    public int hight;

    public Cube(){
        lenght =5;
        widtth =4;
        hight = 3;
        System.out.println("Const without parametars,");
    }

    public Cube(int a, int b){
        lenght = a;
        hight = b;
        widtth = 9;
        System.out.println("const with 2 parametars.");
    }

    public Cube(int a, int b, int c){
        lenght = a;
        widtth = b;
        hight = c;
        System.out.println("Const with 3 parametars");
    }

    public int surfce(){
        int a = 2*(lenght*hight + lenght*widtth + hight*widtth);
        System.out.println("Surface is: "+a);
        return a;
    }

    public double volume(){
        int a = lenght * widtth * hight;
        System.out.println("Volume is: " +a);
        return a;
    }
}
