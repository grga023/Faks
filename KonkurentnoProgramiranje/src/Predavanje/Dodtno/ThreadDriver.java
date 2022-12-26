package Predavanje.Dodtno;

public class ThreadDriver {
    public static void main(String[] args) {
        Car cars = new Car();
        ThreadAddCar addCar = new ThreadAddCar("BMW", "M3", "Blue", 2021, 54837982, 3000, 456);

        ThreadSearch threadSearch = new ThreadSearch(cars);

        addCar.start();
        threadSearch.start();

        cars.out();
        cars.out();

    }
}
