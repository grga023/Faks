package Predavanje.Dodtno;

import java.util.LinkedList;

public class ThreadChangeCar extends Thread{
    private LinkedList<Car> carsToChange;
    private String color;
    private int vin;

    public ThreadChangeCar(Car cars,String color, int vin){
        this.color = color;
        this.vin = vin;
        carsToChange = new LinkedList<Car>();
        carsToChange = cars.getCarsList();
    }

    private void changeCar(String color, int vin){
        for (var car: carsToChange) {
            if(car.getVin() == vin){
                car.setColor(color);
            }
        }
    }

    @Override
    public void run() {
        changeCar(color, vin);
        System.out.println("Changed");
    }
}
