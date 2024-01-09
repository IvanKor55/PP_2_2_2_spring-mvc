package web;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

import static web.model.CarServiseImpl.firstCountlistCars;

public class Main {
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
    public static List<String> listCarsInString (Integer count) {
        List<String> stringList = new ArrayList<>();
        if (count == null) {
            stringList.add("A request was entered for an empty list");
        } else {
            List<Car> listCountCars = firstCountlistCars(listCars, count);
            for (int i = 0; i < count && i < 5; i++) {
                stringList.add(listCountCars.get(i).toString());
            }
        }
        return stringList;
    }
}
