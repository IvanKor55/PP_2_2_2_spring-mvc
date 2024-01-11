package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Car> listCars;
    static {
        listCars = new ArrayList<>();
        listCars.add(new Car("Model1", "Color1", 1));
        listCars.add(new Car("Model2", "Color2", 2));
        listCars.add(new Car("Model3", "Color3", 3));
        listCars.add(new Car("Model4", "Color4", 4));
        listCars.add(new Car("Model5", "Color5", 5));
    }
}
