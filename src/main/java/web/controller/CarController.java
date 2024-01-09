package web.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static web.Main.listCarsInString;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String cars(ModelMap model, @RequestParam(value = "count", required = false) Integer count,
            HttpServletResponse response) {
        List<String> messages = listCarsInString(count);
        model.addAttribute("messages", messages);
        response.setCharacterEncoding("UTF-8");
        return "cars/cars";
    }
}
