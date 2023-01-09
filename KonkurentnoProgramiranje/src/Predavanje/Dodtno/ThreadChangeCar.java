package Predavanje.Dodtno;

import java.util.LinkedList;

public class ThreadChangeCar extends Thread{
    private LinkedList<Car> carsToChange;
    private String color;
    private int vin;

    public ThreadChangeCar(Car cars,String color, int vin){
        this.color = color;
        this.vin = vin;
        cars.changeCar(color, vin);
    }

    @Override
    public void run() {
        System.out.println("Changed");
    }
}
