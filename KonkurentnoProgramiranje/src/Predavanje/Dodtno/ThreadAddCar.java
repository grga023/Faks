package Predavanje.Dodtno;

import java.util.LinkedList;

public class ThreadAddCar extends Thread{
    private Car Cars;



    public ThreadAddCar(String mark, String model, String color, int year, int vin, int cubics, int ps, Car car){
        Cars = new Car();
        Cars.setMark(mark);
        Cars.setModel(model);
        Cars.setColor(color);
        Cars.setPs(ps);
        Cars.setVin(vin);
        Cars.setYear(year);
        Cars.setCubics(cubics);

        car.addCar(Cars);

    }
    @Override
    public void run() {

    }
}
