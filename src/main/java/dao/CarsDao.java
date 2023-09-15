package dao;

import models.Car;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface CarsDao  {

    List<Car> getCars();
}
