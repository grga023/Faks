package Predavanje.Dodtno;

import java.util.LinkedList;

public class ThreadSearch extends Thread{
    private int cubics;
    private ThreadView threadView;
    private String color;
    private LinkedList<Car> searchCar;

    public ThreadSearch(Car car){
        searchCar = new LinkedList<Car>();
        searchCar = car.getCarsList();
    }

    private void search(int cubics, String color){
        for (var car: searchCar) {
            if(true/*car.getColor() == color || car.getCubics() == cubics*/)
                car.out();
        }
    }

    @Override
    public void run() {
        search(cubics, color);
    }
}
