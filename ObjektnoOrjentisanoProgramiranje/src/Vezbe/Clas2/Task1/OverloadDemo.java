package Vezbe.Clas2.Task1;

import javax.swing.*;

public class OverloadDemo {
    public OverloadDemo(){

    }

    public void getParametars(int a){
        System.out.println("a " +a);
    }
    public void getParametars(int a, int b){
        System.out.println("a i b: " +a+" "+b);
    }
    public void  getParametars(double a){
        System.out.println("Double a:" +a);
    }
    public void getParametars(){
        System.out.println("No parametars.");
    }
}
