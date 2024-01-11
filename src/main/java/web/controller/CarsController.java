package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<String> messages = carService.getlistCars(count);
        model.addAttribute("messages", messages);
        return "cars/cars";
    }
}
