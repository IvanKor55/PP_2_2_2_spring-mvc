package web.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Main;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.List;

@Controller
public class CarsController {
    private CarService carService = new CarServiseImpl();
    @GetMapping(value = "/cars")
    public String cars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        List<String> messages = carService.getlistCars(count);
        model.addAttribute("messages", messages);
        return "cars/cars";
    }
}
