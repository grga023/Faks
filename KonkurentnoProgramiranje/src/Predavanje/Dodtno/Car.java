package Predavanje.Dodtno;

import java.util.LinkedList;

public class Car{
    private int vin;

    private int cubics;

    private int ps;

    private int year;
    private String color;
    private String mark;
    private String model;
    private  LinkedList <Car> carsList;
    public Car(){

        carsList = new LinkedList<Car>();
    }

    public void addCar(Car car){

        carsList.add(car);
    }
    public void deleteCar(Car car, int vin){
        for (var toDelete: carsList) {
            if(toDelete.getVin() == vin)
                carsList.remove(car);
        }

    }

    public LinkedList<Car> getCarsList() {

        return carsList;
    }

    public void out(){
        String out;
        for (var car : carsList) {
            out = car.mark+"\t "+ car.model+"\t is: "+car.color+"\t and have: "+car.cubics+"cc,\t "+car.ps+"ps.\t Maded:"+car.year+"year. \tVin is:"+car.vin;
            System.out.println(out);
        }
    }

    public void changeCar(String color, int vin){
        for (var car: carsList) {
            if(car.getVin() == vin){
                car.setColor(color);
            }
        }
    }


    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setCubics(int cubics) {
        this.cubics = cubics;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVin() {
        return vin;
    }

    public int getCubics() {
        return cubics;
    }

    public int getPs() {
        return ps;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }


}
