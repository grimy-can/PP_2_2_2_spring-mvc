package service;

import models.Car;
import java.util.List;


public interface Service {
    List<Car> getCars(String amount);
}
