package Predavanje.Dodtno;

public class ThreadAddCar extends Thread{
    private Car car;

    public ThreadAddCar(String mark, String model, String color, int year, int vin, int cubics, int ps){
        car = new Car();
        car.setMark(mark);
        car.setModel(model);
        car.setColor(color);
        car.setPs(ps);
        car.setVin(vin);
        car.setYear(year);
        car.setCubics(cubics);
    }

    @Override
    public void run() {
        car.addCar(car);
        car.out();
        System.out.println("-------------------");

    }
}
