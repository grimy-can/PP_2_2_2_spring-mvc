package web.controller;

import models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarsService;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private static final CarsService carsService = new CarsService();

    @GetMapping(value ="/cars")
    public String listOfCars(ModelMap model, @RequestParam(value = "count", required = false) String countStr) {

        List<String> messages = new ArrayList<>();
        messages.add("Requested cars:");
        for (Car car : carsService.getCars(countStr)) {
            messages.add(car.toString());
        }
        model.addAttribute("messages", messages);
        return "cars";
    }
}
