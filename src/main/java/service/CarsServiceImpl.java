package service;

import dao.CarsDaoImpl;
import models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarsServiceImpl implements CarsService {


    private final CarsDaoImpl carsDao = new CarsDaoImpl();
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
    public List<Car> getCars(String amount) {

        int count = cars.size();
        if (amount != null) {
            count = Integer.parseInt(amount);
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
