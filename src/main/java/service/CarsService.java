package service;

import models.Car;
import java.util.List;


public interface CarsService {
    List<Car> getCars(String amount);
}
