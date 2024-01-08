package web.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String cars(ModelMap model, @RequestParam(value = "count", required = false) Integer count,
            HttpServletResponse response) {
        List<String> messages = new ArrayList<>();
        if (count == null) {
//            messages.add("Введен запрос на пустой список");
            messages.add("A request was entered for an empty list");
        } else {
            for (int i = 0; i < count && i < 5; i++) {
                messages.add(web.Car.listCars().get(i).toString());
            }
        }
        model.addAttribute("messages", messages);
        response.setCharacterEncoding("UTF-8");
        return "cars/cars";
    }
}
