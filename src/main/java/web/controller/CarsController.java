package web.controller;

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

        int count = carsService.getCars().size();
        if (countStr != null) {
            count = Integer.parseInt(countStr);
        }

        List<String> messages = new ArrayList<>();
        messages.add("Requested cars:");

        carsService.getCars().stream().limit(count).forEach(car -> messages.add(car.toString()));
        model.addAttribute("messages", messages);

        return "cars";
    }
}
