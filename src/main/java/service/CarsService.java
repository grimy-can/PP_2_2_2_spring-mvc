package service;

import dao.CarsDao;
import models.Car;
import java.util.ArrayList;
import java.util.List;

public class CarsService implements CarsDao {

    private static final List<Car> cars;

    static {
        cars = new ArrayList<>();
        Car car1 = new Car("Pontiac Aztek", "Fern Green", 2004);
        Car car2 = new Car("Fleetwood Bounder", "Beige", 1986);
        Car car3 = new Car("Chrysler 300", "Black", 2012);
        Car car4 = new Car("Suzuki Esteem", "Yellow", 1998);
        Car car5 = new Car("Chrysler", "Black", 1988);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
