package Predavanje.Dodtno;

public class ThreadDriver {
    public static void main(String[] args) throws InterruptedException {

        Car cars = new Car();
        cars.out();

        ThreadAddCar addCar = new ThreadAddCar("BMW", "M3", "Purple", 2021, 54837982, 3000, 456, cars);
        ThreadAddCar addCar2 = new ThreadAddCar("BMW", "M4", "Gray", 2018, 543345, 4500, 670, cars);
        ThreadAddCar addCar3 = new ThreadAddCar("BMW", "M5", "Yellow", 2016, 54534453, 5000, 750, cars);

        ThreadAddCar addCar4 = new ThreadAddCar("Audi", "RS3", "Black", 2015, 7688768, 2500, 450, cars);
        ThreadAddCar addCar5 = new ThreadAddCar("Audi", "A3", "Pink", 2022, 776575657, 1400, 150, cars);
        ThreadAddCar addCar6 = new ThreadAddCar("Audi", "R8", "Blue", 2007, 76575675, 5000, 670, cars);

        ThreadAddCar addCar7 = new ThreadAddCar("Toyota", "Yaris", "White", 2022, 2342342, 1500, 250, cars);
        ThreadAddCar addCar8 = new ThreadAddCar("Toyota", "CHR", "Red", 2019, 3423432, 2000, 200, cars);
        ThreadAddCar addCar9 = new ThreadAddCar("Toyota", "Auris", "Green", 2016, 32324234, 1600, 132, cars);

        addCar.start();
        addCar2.start();
        addCar3.start();
        addCar4.start();
        addCar5.start();
        addCar6.start();
        addCar7.start();
        addCar8.start();
        addCar9.start();

        cars.out();
        Thread.sleep(1000);
        System.out.println("----------------------------");

        ThreadChangeCar threadChangeCar = new ThreadChangeCar(cars, "Black", 54837982);
        threadChangeCar.start();
        cars.out();
        Thread.sleep(1000);

        System.out.println("----------------------------------------------------------------------------");

        ThreadSearch threadSearch = new ThreadSearch(cars,2000);
        threadSearch.start();

        ThreadDelete threadDelete = new ThreadDelete(cars, 7688768);
        ThreadDelete threadDelete1 = new ThreadDelete(cars, 76575675);
        ThreadDelete threadDelete2 = new ThreadDelete(cars, 776575657);

        threadDelete.start();
        threadDelete1.start();
        threadDelete2.start();

        cars.out();
    }
}
