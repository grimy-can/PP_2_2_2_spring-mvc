package web.controller;

import models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarsService;
import service.CarsServiceImpl;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    private final CarsService carsService;

    @Autowired
    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

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
