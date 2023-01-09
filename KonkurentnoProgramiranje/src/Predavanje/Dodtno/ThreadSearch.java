package Predavanje.Dodtno;

import java.util.LinkedList;
import java.util.Objects;

public class ThreadSearch extends Thread{
    private int cubics = 0;
    private String mark = "";
    private LinkedList<Car> searchCar;

    public ThreadSearch(Car car, String mark){
        this.mark = mark;
        searchCar = new LinkedList<Car>();
        searchCar = car.getCarsList();
    }
    public ThreadSearch(Car car, int cubics){
        this.cubics = cubics;
        searchCar = new LinkedList<Car>();
        searchCar = car.getCarsList();
    }

    public ThreadSearch(Car car, int cubics, String mark){
        this.cubics = cubics;
        this.mark = mark;
        searchCar = new LinkedList<Car>();
        searchCar = car.getCarsList();
    }

    private int colCub(){
        if(Objects.equals(mark, "")){
            return 1;
        }
        else if(cubics == 0){
            return 2;
        }
        else return 3;
    }

    @Override
    public void run() {
        String pretraga;
        var prom = "";

        if(colCub() == 1) {
            pretraga = " kubicima";
            prom = String.valueOf(cubics);

        }
        else if(colCub() == 2) {
            pretraga = " marki";
            prom = mark;
        }
        else {
            pretraga = " marki i kubicima";
            prom = " "+mark +", "+ cubics+"cc";
        }

        System.out.println("Pretraga po "+pretraga+":"+prom);

        if(colCub() == 1) {
            for (var car: searchCar) {
                if((car.getCubics() >= cubics)){
                    String out = car.getMark() + " " + car.getModel() + " is:" + car.getColor() + " and have:" + car.getCubics() + "cc and:" + car.getPs() + "ps. Maded:" + car.getYear() + "year. Vin is:" + car.getVin();
                    System.out.println(out);
                }
            }

        }
        else if(colCub() == 2) {
            for (var car: searchCar) {
                String comp = car.getMark();
                if(Objects.equals(comp, mark)){
                    String out = car.getMark() + " " + car.getModel() + " is:" + car.getColor() + " and have:" + car.getCubics() + "cc and:" + car.getPs() + "ps. Maded:" + car.getYear() + "year. Vin is:" + car.getVin();
                    System.out.println(out);
                }
            }
        }
        else {
            for (var car: searchCar) {
                String comp = car.getMark();
                if(Objects.equals(comp, mark) && (car.getCubics() <= cubics)){
                    String out = car.getMark() + " " + car.getModel() + " is:" + car.getColor() + " and have:" + car.getCubics() + "cc and:" + car.getPs() + "ps. Maded:" + car.getYear() + "year. Vin is:" + car.getVin();
                    System.out.println(out);
                }
            }
        }


    }
}
