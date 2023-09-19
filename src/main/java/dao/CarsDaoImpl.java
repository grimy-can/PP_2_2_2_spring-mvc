package dao;

import models.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarsDaoImpl implements CarsDao {

    private static final List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
