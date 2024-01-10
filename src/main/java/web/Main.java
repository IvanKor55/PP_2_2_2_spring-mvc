package web;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private CarService carService = new CarServiseImpl();
    public static List<Car> listCars = listCars ();
    public static List<Car> listCars () {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("Model1", "Color1", 1));
        listCars.add(new Car("Model2", "Color2", 2));
        listCars.add(new Car("Model3", "Color3", 3));
        listCars.add(new Car("Model4", "Color4", 4));
        listCars.add(new Car("Model5", "Color5", 5));
        return listCars;
    }
    public List<String> listCarsInString (Integer count) {
        List<String> stringList = new ArrayList<>();
        if (count == null || count <= 0) {
            stringList.add("A request was entered for an empty list");
        } else {
            List<Car> listCountCars = carService.firstCountlistCars(listCars, count);
            for (int i = 0; i < count && i < 5; i++) {
                stringList.add(listCountCars.get(i).toString());
            }
        }
        return stringList;
    }
}
