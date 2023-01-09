package Predavanje.Dodtno;

import java.util.LinkedList;

public class ThreadDelete extends Thread{
    LinkedList <Car> cars;
    public ThreadDelete(Car car, int vin){
        car.deleteCar(car, vin);
    }

    @Override
    public void run() {

    }
}
